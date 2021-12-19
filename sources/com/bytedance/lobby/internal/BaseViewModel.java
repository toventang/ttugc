package com.bytedance.lobby.internal;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;

public abstract class BaseViewModel<T> extends AndroidViewModel {

    /* renamed from: b */
    private C1213t<T> f49455b = new C1213t<>();

    static {
        Covode.recordClassIndex(24515);
    }

    /* renamed from: g */
    public LiveData<T> mo34364g() {
        return this.f49455b;
    }

    /* renamed from: b */
    public void mo34361b(T t) {
        this.f49455b.setValue(t);
    }

    BaseViewModel(Application application) {
        super(application);
    }
}
