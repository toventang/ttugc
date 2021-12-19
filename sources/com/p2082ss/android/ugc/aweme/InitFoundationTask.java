package com.p2082ss.android.ugc.aweme;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.AbstractC17350d;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.fragment.C17372a;
import com.p2082ss.android.ugc.aweme.activity.TikTokActivityViewModel;
import com.p2082ss.android.ugc.aweme.activity.p2281a.C33068a;
import com.p2082ss.android.ugc.aweme.activity.processor.C33085j;
import com.p2082ss.android.ugc.aweme.fragment.TikTokFragmentViewModel;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.InitFoundationTask */
public final class InitFoundationTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(37968);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.InitFoundationTask$a */
    static final class C31283a extends AbstractC89220m implements AbstractC89171a<List<? extends AbstractC17350d>> {

        /* renamed from: a */
        public static final C31283a f74967a = new C31283a();

        static {
            Covode.recordClassIndex(37969);
        }

        C31283a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ List<? extends AbstractC17350d> invoke() {
            return C89086z.INSTANCE;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C89219l.m154721d(TikTokActivityViewModel.class, "");
        ActivityC17312a.viewModelClass = TikTokActivityViewModel.class;
        C89219l.m154721d(TikTokFragmentViewModel.class, "");
        C17372a.f41689b = TikTokFragmentViewModel.class;
        ActivityC17312a.processGenerator = C31283a.f74967a;
        ActivityC17312a.C17313a.m32060a(C33068a.f78625a);
        ActivityC17312a.C17313a.m32060a(C33085j.f78648d);
    }
}
