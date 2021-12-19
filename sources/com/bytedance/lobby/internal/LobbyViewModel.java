package com.bytedance.lobby.internal;

import android.app.Application;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;

public class LobbyViewModel extends BaseViewModel<AuthResult> {
    static {
        Covode.recordClassIndex(24519);
    }

    /* Return type fixed from 'androidx.lifecycle.LiveData' to match base method */
    @Override // com.bytedance.lobby.internal.BaseViewModel
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ LiveData<AuthResult> mo34364g() {
        return super.mo34364g();
    }

    public LobbyViewModel(Application application) {
        super(application);
    }

    /* renamed from: a */
    public static LobbyViewModel m39332a(ActivityC0945e eVar) {
        return (LobbyViewModel) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(LobbyViewModel.class);
    }
}
