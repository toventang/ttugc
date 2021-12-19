package com.p2082ss.android.ugc.aweme.commercialize.profile;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget */
public abstract class AbsAdProfileWidget extends Widget implements AbstractC1214u<C33942b>, AbstractC33974au {

    /* renamed from: a */
    public Aweme f90607a;

    /* renamed from: h */
    public Fragment f90608h;

    /* renamed from: i */
    public String f90609i;

    static {
        Covode.recordClassIndex(45841);
    }

    /* renamed from: a */
    public void mo66951a(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        mo66952e();
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onDestroy() {
        super.onDestroy();
        DataCenter dataCenter = this.f80273e;
        if (dataCenter != null) {
            dataCenter.mo60188a(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo66952e() {
        DataCenter dataCenter = this.f80273e;
        if (dataCenter != null) {
            dataCenter.mo60189a("AD_PROFILE_PARAMS", (AbstractC1214u<C33942b>) this);
        }
        DataCenter dataCenter2 = this.f80273e;
        if (dataCenter2 != null) {
            dataCenter2.mo60189a("AD_PROFILE_VISIBILITY_CHANGED", (AbstractC1214u<C33942b>) this);
        }
    }

    /* renamed from: a */
    public final <T extends View> T mo66948a(int i) {
        View view = this.f80272d;
        if (view != null) {
            return (T) view.findViewById(i);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    /* renamed from: a */
    public void mo60206a(View view) {
        C38426i iVar;
        super.mo60206a(view);
        DataCenter dataCenter = this.f80273e;
        if (dataCenter != null && (iVar = (C38426i) dataCenter.mo60192a("AD_PROFILE_PARAMS")) != null) {
            mo66950a(iVar);
        }
    }

    /* renamed from: a */
    public void mo66950a(C38426i iVar) {
        C89219l.m154721d(iVar, "");
        this.f90607a = iVar.f90782a;
        this.f90608h = iVar.f90783b;
        this.f90609i = iVar.f90784c;
    }

    /* renamed from: a */
    public void onChanged(C33942b bVar) {
        String str;
        C38426i iVar;
        Boolean bool;
        if (bVar != null && (str = bVar.f80277a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1433406312) {
                if (hashCode == -322064775 && str.equals("AD_PROFILE_VISIBILITY_CHANGED") && (bool = (Boolean) bVar.mo60212a()) != null) {
                    mo66951a(bool.booleanValue());
                }
            } else if (str.equals("AD_PROFILE_PARAMS") && (iVar = (C38426i) bVar.mo60212a()) != null) {
                mo66950a(iVar);
            }
        }
    }
}
