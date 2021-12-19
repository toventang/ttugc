package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3148c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a.AbstractC54850d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a.C54841a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.aweme.services.IMainService;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.c.b */
public final class C54863b implements AbstractC54862a {

    /* renamed from: a */
    private final AbstractC56237a f125639a;

    static {
        Covode.recordClassIndex(64582);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3148c.AbstractC54862a
    /* renamed from: a */
    public final String mo91874a() {
        Boolean bool;
        String displayName;
        String str = "";
        if (this.f125639a.mo91860c() != 0) {
            String f = this.f125639a.mo91869f();
            C89219l.m154716b(f, str);
            return f;
        }
        AbstractC56237a aVar = this.f125639a;
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chatlist.data.session.ChatSession");
        IMUser a = ((C54841a) aVar).mo91858a();
        if (a != null) {
            IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
            if (createIMainServicebyMonsterPlugin != null) {
                bool = Boolean.valueOf(createIMainServicebyMonsterPlugin.shouldChangeToHandle("Message"));
            } else {
                bool = null;
            }
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                displayName = a.getDisplayId();
            } else {
                displayName = a.getDisplayName();
            }
            if (displayName != null) {
                str = displayName;
            }
        }
        return str;
    }

    public C54863b(AbstractC56237a aVar) {
        C89219l.m154721d(aVar, "");
        this.f125639a = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.c.b$a */
    static final class C54864a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C54864a f125640a = new C54864a();

        static {
            Covode.recordClassIndex(64583);
        }

        C54864a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_3pt_exclamation_mark_circle;
            aVar2.f54435e = Integer.valueOf((int) R.attr.av);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3148c.AbstractC54862a
    /* renamed from: a */
    public final Drawable mo91873a(Context context) {
        C89219l.m154721d(context, "");
        int c = this.f125639a.mo91860c();
        if (c != 0 && c != 20) {
            return null;
        }
        AbstractC56237a aVar = this.f125639a;
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chatlist.data.session.IMBaseSession");
        AbstractC54850d.EnumC54851a aVar2 = ((AbstractC54850d) aVar).f125628f;
        if (aVar2 != null) {
            int i = C54865c.f125641a[aVar2.ordinal()];
            if (i == 1) {
                return C23005c.m43393a(C54864a.f125640a).mo37368a(context);
            }
            if (i == 2) {
                return C0643b.m2369a(context, (int) R.drawable.au7);
            }
        }
        return null;
    }
}
