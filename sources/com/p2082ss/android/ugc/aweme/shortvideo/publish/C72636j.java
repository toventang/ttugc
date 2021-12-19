package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.internal.PrivacyServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.AVPreferences;
import com.p2082ss.android.ugc.aweme.setting.C68034bs;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.j */
public final class C72636j {

    /* renamed from: a */
    public boolean f162811a;

    /* renamed from: b */
    public boolean f162812b;

    /* renamed from: c */
    public final CommonSettingItemStatus f162813c;

    /* renamed from: d */
    public final Context f162814d;

    static {
        Covode.recordClassIndex(85319);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.j$a */
    public static final class C72637a {

        /* renamed from: a */
        public boolean f162815a = true;

        /* renamed from: b */
        public boolean f162816b = true;

        /* renamed from: c */
        public boolean f162817c;

        /* renamed from: d */
        public int f162818d;

        /* renamed from: e */
        public int f162819e;

        /* renamed from: f */
        public int f162820f;

        /* renamed from: g */
        public View.OnClickListener f162821g;

        /* renamed from: h */
        public final String f162822h;

        static {
            Covode.recordClassIndex(85320);
        }

        public C72637a(String str) {
            C89219l.m154721d(str, "");
            this.f162822h = str;
        }
    }

    /* renamed from: a */
    public final void mo114921a(boolean z) {
        this.f162811a = z;
        if (z) {
            this.f162812b = true;
            this.f162813c._checked.setValue(false);
            this.f162813c._alpha.setValue(Float.valueOf(0.4f));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.j$b */
    public static final class C72638b extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72636j f162823a;

        /* renamed from: b */
        final /* synthetic */ int f162824b;

        /* renamed from: c */
        final /* synthetic */ C39256o f162825c;

        /* renamed from: d */
        final /* synthetic */ boolean f162826d;

        /* renamed from: e */
        final /* synthetic */ C72637a f162827e;

        static {
            Covode.recordClassIndex(85321);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72638b(C72636j jVar, int i, C39256o oVar, boolean z, C72637a aVar) {
            super(1);
            this.f162823a = jVar;
            this.f162824b = i;
            this.f162825c = oVar;
            this.f162826d = z;
            this.f162827e = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            View view2 = view;
            if (!this.f162823a.f162812b) {
                View.OnClickListener onClickListener = this.f162827e.f162821g;
                if (onClickListener != null) {
                    onClickListener.onClick(view2);
                }
            } else if (this.f162824b == 1) {
                C39256o oVar = this.f162825c;
                if (!(oVar == null || oVar.getResType() != 1 || view2 == null)) {
                    new C23144b(view2).mo37640e(R.string.fko).mo37637b();
                }
            } else if (!this.f162826d || this.f162827e.f162819e == 0) {
                if (!this.f162823a.f162811a || this.f162827e.f162820f == 0) {
                    if (!(!this.f162827e.f162817c || this.f162827e.f162818d == 0 || view2 == null)) {
                        new C23144b(view2).mo37640e(this.f162827e.f162818d).mo37637b();
                    }
                } else if (view2 != null) {
                    new C23144b(view2).mo37640e(this.f162827e.f162820f).mo37637b();
                }
            } else if (view2 != null) {
                new C23144b(view2).mo37640e(this.f162827e.f162819e).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo114920a(C72637a aVar) {
        int i;
        boolean z;
        int i2;
        C89219l.m154721d(aVar, "");
        C39256o a = C39223a.m79605s().mo68677a(1, aVar.f162822h);
        boolean z2 = false;
        if (a != null) {
            i = a.getShowType();
        } else {
            i = 0;
        }
        boolean a2 = PrivacyServiceImpl.m103033c().mo93975a();
        if (!aVar.f162815a || i == 2) {
            this.f162813c._visibility.setValue(8);
            return;
        }
        this.f162813c._visibility.setValue(0);
        if ((!a2 || aVar.f162819e == 0) && i != 1 && ((!this.f162811a || aVar.f162820f == 0) && !aVar.f162817c)) {
            z = false;
        } else {
            z = true;
        }
        this.f162812b = z;
        if (z) {
            this.f162813c._alpha.setValue(Float.valueOf(0.4f));
        } else {
            this.f162813c._alpha.setValue(Float.valueOf(1.0f));
        }
        C1213t<Boolean> tVar = this.f162813c._checked;
        if (aVar.f162816b && !this.f162812b) {
            z2 = true;
        }
        tVar.setValue(Boolean.valueOf(z2));
        if (TextUtils.equals(aVar.f162822h, "duet")) {
            AVPreferences e = C63244g.m114602a().mo73277e();
            if (C89219l.m154714a((Object) this.f162813c._checked.getValue(), (Object) true)) {
                i2 = C68034bs.f152394e;
            } else {
                i2 = C68034bs.f152395f;
            }
            e.setReactDuetSettingCurrent(i2);
        }
        this.f162813c.addOnClickListener(new C72638b(this, i, a, a2, aVar));
    }

    public C72636j(CommonSettingItemStatus commonSettingItemStatus, Context context) {
        C89219l.m154721d(commonSettingItemStatus, "");
        C89219l.m154721d(context, "");
        this.f162813c = commonSettingItemStatus;
        this.f162814d = context;
    }
}
