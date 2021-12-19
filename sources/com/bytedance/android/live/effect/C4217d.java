package com.bytedance.android.live.effect;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.effect.api.AbstractC4167d;
import com.bytedance.android.live.effect.api.AbstractC4169e;
import com.bytedance.android.live.effect.api.AbstractC4170f;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.p240a.AbstractC4152e;
import com.bytedance.android.live.effect.api.p240a.AbstractC4154g;
import com.bytedance.android.live.effect.api.p240a.AbstractC4155h;
import com.bytedance.android.live.effect.api.p240a.AbstractC4162k;
import com.bytedance.android.live.effect.model.C4312b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.d */
public final class C4217d {

    /* renamed from: a */
    public static final IEffectService f11697a;

    /* renamed from: b */
    public static final C4217d f11698b = new C4217d();

    /* renamed from: c */
    private static final AbstractC89244h f11699c = C89250i.m154773a((AbstractC89171a) C4218a.f11700a);

    /* renamed from: a */
    public static final AbstractC4170f m10317a() {
        return (AbstractC4170f) f11699c.getValue();
    }

    private C4217d() {
    }

    /* renamed from: com.bytedance.android.live.effect.d$a */
    static final class C4218a extends AbstractC89220m implements AbstractC89171a<AbstractC4170f> {

        /* renamed from: a */
        public static final C4218a f11700a = new C4218a();

        static {
            Covode.recordClassIndex(4788);
        }

        C4218a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC4170f invoke() {
            return C4217d.f11697a.getLiveFilterManager();
        }
    }

    /* renamed from: b */
    public static final AbstractC11293v m10319b() {
        AbstractC11293v effectNewDialogFragment = f11697a.getEffectNewDialogFragment(null);
        C89219l.m154716b(effectNewDialogFragment, "");
        return effectNewDialogFragment;
    }

    /* renamed from: c */
    public static final AbstractC4162k m10320c() {
        AbstractC4162k liveEffectRestoreManager = f11697a.getLiveEffectRestoreManager();
        C89219l.m154716b(liveEffectRestoreManager, "");
        return liveEffectRestoreManager;
    }

    /* renamed from: d */
    public static final AbstractC4155h m10321d() {
        AbstractC4155h composerManager = f11697a.composerManager();
        C89219l.m154716b(composerManager, "");
        return composerManager;
    }

    /* renamed from: e */
    public static final AbstractC4152e m10322e() {
        AbstractC4152e baseComposerManager = f11697a.baseComposerManager();
        C89219l.m154716b(baseComposerManager, "");
        return baseComposerManager;
    }

    /* renamed from: f */
    public static final AbstractC4169e m10323f() {
        AbstractC4169e liveFilterHelper = f11697a.getLiveFilterHelper();
        C89219l.m154716b(liveFilterHelper, "");
        return liveFilterHelper;
    }

    /* renamed from: g */
    public static final AbstractC4167d m10324g() {
        AbstractC4167d effectLogHelper = f11697a.getEffectLogHelper();
        C89219l.m154716b(effectLogHelper, "");
        return effectLogHelper;
    }

    static {
        Covode.recordClassIndex(4787);
        AbstractC2953a a = C6193a.m13435a(IEffectService.class);
        C89219l.m154716b(a, "");
        f11697a = (IEffectService) a;
    }

    /* renamed from: a */
    public static final AbstractC11293v m10318a(AbstractC4154g gVar, C4312b bVar) {
        C89219l.m154721d(gVar, "");
        AbstractC11293v effectDialogFragment = f11697a.getEffectDialogFragment(gVar, bVar);
        C89219l.m154716b(effectDialogFragment, "");
        return effectDialogFragment;
    }
}
