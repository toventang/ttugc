package com.p2082ss.android.ugc.aweme.sticker.types.game;

import android.content.SharedPreferences;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.bpea.basics.C13349j;
import com.bytedance.bpea.basics.C13350k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.p878a.C13401b;
import com.bytedance.common.utility.p910e.C13611a;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14196o;
import com.bytedance.creativex.recorder.p940b.p941a.C14206w;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76077k;
import com.p2082ss.android.ugc.aweme.sticker.types.game.p4011a.AbstractC76065a;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.game.a */
public final class C76060a {
    static {
        Covode.recordClassIndex(89005);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.types.game.a$a */
    public static class C76062a implements AbstractC76077k {

        /* renamed from: a */
        private final AbstractC14177d f170892a;

        /* renamed from: b */
        private final AbstractC14330a f170893b;

        static {
            Covode.recordClassIndex(89007);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76077k
        /* renamed from: a */
        public final int mo119780a() {
            return this.f170892a.mo22757K();
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76077k
        /* renamed from: b */
        public final void mo119782b() {
            C75346e.m132156a(this.f170893b, (Effect) null);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76077k
        /* renamed from: c */
        public final void mo119783c() {
            SharedPreferences.Editor edit = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
            edit.putInt("record_mode", 1);
            C13611a.m24460a(edit);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76077k
        /* renamed from: a */
        public final void mo119781a(AbstractC76077k.EnumC76078a aVar) {
            PrivacyCert privacyCert;
            if (C760611.f170891a[aVar.ordinal()] != 1) {
                privacyCert = new PrivacyCert(new C13349j("1041"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()});
            } else {
                privacyCert = new PrivacyCert(new C13349j("1040"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()});
            }
            this.f170892a.mo22774a(false, privacyCert, (String) null);
        }

        private C76062a(AbstractC14177d dVar, AbstractC14330a aVar) {
            this.f170892a = dVar;
            this.f170893b = aVar;
        }

        /* synthetic */ C76062a(AbstractC14177d dVar, AbstractC14330a aVar, byte b) {
            this(dVar, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.types.game.a$b */
    public static class C76063b implements AbstractC76079l {

        /* renamed from: a */
        public final AbstractC14193m f170894a;

        /* renamed from: b */
        public final AbstractC14330a f170895b;

        static {
            Covode.recordClassIndex(89008);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76079l
        /* renamed from: b */
        public final void mo119785b() {
            this.f170894a.mo22893c(true);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76079l
        /* renamed from: d */
        public final void mo119787d() {
            this.f170894a.mo22893c(true);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76079l
        /* renamed from: e */
        public final void mo119788e() {
            this.f170894a.mo22886a(false);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76079l
        /* renamed from: a */
        public final void mo119784a() {
            C14207x xVar = new C14207x("game_record_full");
            xVar.f34485a = 2;
            this.f170894a.mo22889b(xVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76079l
        /* renamed from: c */
        public final void mo119786c() {
            this.f170894a.mo22878a(new C14206w(EnumC78601i.NORMAL));
            this.f170894a.mo22876a(new C14196o(1));
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76079l
        /* renamed from: f */
        public final void mo119789f() {
            AbstractC14193m mVar = this.f170894a;
            C14207x xVar = new C14207x("quit game");
            xVar.f34485a = 6;
            xVar.f34490f = new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.sticker.types.game.C76060a.C76063b.RunnableC760641 */

                static {
                    Covode.recordClassIndex(89009);
                }

                public final void run() {
                    if (C76063b.this.f170895b != null) {
                        C76063b.this.f170895b.mo23120b(true);
                    }
                }
            };
            mVar.mo22889b(xVar);
        }

        private C76063b(AbstractC14193m mVar, AbstractC14330a aVar) {
            this.f170894a = mVar;
            this.f170895b = aVar;
        }

        /* synthetic */ C76063b(AbstractC14193m mVar, AbstractC14330a aVar, byte b) {
            this(mVar, aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.game.a$1 */
    static /* synthetic */ class C760611 {

        /* renamed from: a */
        static final /* synthetic */ int[] f170891a;

        static {
            Covode.recordClassIndex(89006);
            int[] iArr = new int[AbstractC76077k.EnumC76078a.values().length];
            f170891a = iArr;
            try {
                iArr[AbstractC76077k.EnumC76078a.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    public static AbstractC76080m m133347a(ActivityC0218d dVar, AbstractC84919c cVar, AbstractC14177d dVar2, AbstractC14193m mVar, AbstractC14330a aVar, FrameLayout frameLayout, AbstractC76065a aVar2) {
        return new C76067b(dVar, cVar, dVar2, new C76083p(frameLayout), new C76062a(dVar2, aVar, (byte) 0), new C76063b(mVar, aVar, (byte) 0), aVar2);
    }
}
