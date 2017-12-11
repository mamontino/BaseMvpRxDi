package com.medhelp.mamontino.baseprojectrxdagger.ui.base;

import com.medhelp.mamontino.baseprojectrxdagger.data.DataHelper;
import com.medhelp.mamontino.baseprojectrxdagger.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class BasePresenter<V extends MvpView> implements MvpPresenter<V>
{
    private static final String TAG = "BasePresenter";

    private final DataHelper dataHelper;
    private final SchedulerProvider schedulerProvider;
    private final CompositeDisposable compositeDisposable;

    private V mvpView;

    @Inject
    public BasePresenter(DataHelper dataHelper,
            SchedulerProvider schedulerProvider,
            CompositeDisposable compositeDisposable)
    {
        this.dataHelper = dataHelper;
        this.schedulerProvider = schedulerProvider;
        this.compositeDisposable = compositeDisposable;
    }

    @Override
    public void onAttach(V mvpView)
    {
        this.mvpView = mvpView;
    }

    @Override
    public void onDetach()
    {
        compositeDisposable.dispose();
        mvpView = null;
    }

    public boolean isViewAttached()
    {
        return mvpView != null;
    }

    public V getMvpView()
    {
        return mvpView;
    }

    public void checkViewAttached()
    {
        if (!isViewAttached()) throw new MvpViewNotAttachedException();
    }

    public DataHelper getDataHelper()
    {
        return dataHelper;
    }

    public SchedulerProvider getSchedulerProvider()
    {
        return schedulerProvider;
    }

    public CompositeDisposable getCompositeDisposable()
    {
        return compositeDisposable;
    }

    public static class MvpViewNotAttachedException extends RuntimeException
    {
        public MvpViewNotAttachedException()
        {
            super("Please call Presenter.onAttach(MvpView) before" +
                    " requesting data to the Presenter");
        }
    }
}
