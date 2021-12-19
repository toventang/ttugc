package com.p2082ss.android.ugc.aweme.servicimpl;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.C0569a;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63198aw;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v;
import com.p2082ss.android.ugc.aweme.utils.C80310cp;
import com.p2082ss.android.ugc.aweme.utils.permission.C80620e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.x */
public final class C67941x implements AbstractC63198aw {
    static {
        Covode.recordClassIndex(80110);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63198aw
    /* renamed from: a */
    public final boolean mo101671a() {
        return C80620e.m139779a();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v
    /* renamed from: a */
    public final int mo101757a(Context context) {
        C89219l.m154721d(context, "");
        return C80620e.m139781c(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63198aw
    /* renamed from: b */
    public final int mo101673b(Context context) {
        C89219l.m154721d(context, "");
        return C80620e.m139778a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63198aw
    /* renamed from: c */
    public final int mo101674c(Context context) {
        C89219l.m154721d(context, "");
        return C80620e.m139780b(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63198aw
    /* renamed from: d */
    public final void mo101675d(Context context) {
        C89219l.m154721d(context, "");
        C80310cp.m139213a(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.x$a */
    static final class C67942a implements C35444b.AbstractC35447b {

        /* renamed from: a */
        final /* synthetic */ AbstractC63264v.AbstractC63265a f152204a;

        static {
            Covode.recordClassIndex(80111);
        }

        C67942a(AbstractC63264v.AbstractC63265a aVar) {
            this.f152204a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
        /* renamed from: a */
        public final void mo53515a(String[] strArr, int[] iArr) {
            this.f152204a.mo87657a(strArr, iArr);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63198aw
    /* renamed from: a */
    public final int mo101670a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        return C0569a.m2367a(context, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63198aw
    /* renamed from: a */
    public final boolean mo101672a(Activity activity, String str) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        return C0569a.m2183a(activity, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v
    /* renamed from: a */
    public final void mo101758a(ActivityC0945e eVar, AbstractC63264v.AbstractC63265a aVar, String... strArr) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(strArr, "");
        C35444b.m72473a(eVar, strArr, new C67942a(aVar));
    }
}
