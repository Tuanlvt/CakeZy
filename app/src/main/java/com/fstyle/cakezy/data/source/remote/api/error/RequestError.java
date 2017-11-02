package com.fstyle.cakezy.data.source.remote.api.error;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

public abstract class RequestError implements Consumer<Throwable> {

    /**
     * Don't override this method.
     * Override {@link RequestError#onRequestError(BaseException)} instead
     */
    @Override
    public void accept(@NonNull Throwable throwable) throws Exception {
        if (throwable == null) {
            onRequestError(BaseException.toUnexpectedError(new Throwable("Unknown exception")));
            return;
        }
        if (throwable instanceof BaseException) {
            onRequestError((BaseException) throwable);
        } else {
            onRequestError(BaseException.toUnexpectedError(throwable));
        }
    }

    public abstract void onRequestError(BaseException error);
}
