package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f */
public abstract class AbstractC39720f extends AbstractC39714c implements AbstractC39724i {
    static {
        Covode.recordClassIndex(47447);
    }

    /* renamed from: b */
    public abstract int mo69101b();

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i
    /* renamed from: c */
    public boolean mo69102c() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i
    /* renamed from: d */
    public boolean mo69103d() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c
    /* renamed from: a */
    public AbstractC39714c.AbstractC39715a mo69094a() {
        return new C39721a(mo69101b());
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f$a */
    public static final class C39721a implements AbstractC39714c.AbstractC39715a {

        /* renamed from: a */
        final /* synthetic */ int f93570a;

        static {
            Covode.recordClassIndex(47448);
        }

        C39721a(int i) {
            this.f93570a = i;
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c.AbstractC39715a
        /* renamed from: a */
        public final C39723h mo69096a(Context context, ViewGroup viewGroup) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(viewGroup, "");
            View a = C1764a.m5927a(LayoutInflater.from(context), this.f93570a, viewGroup, false);
            C89219l.m154716b(a, "");
            return new C39723h(a);
        }
    }
}
