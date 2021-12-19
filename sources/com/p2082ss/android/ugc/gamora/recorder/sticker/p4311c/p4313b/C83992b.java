package com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b;

import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.als.ApiCenter;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.C40888d;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63191aq;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.property.C65503z;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordNewActivity;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.b */
public final class C83992b {

    /* renamed from: a */
    public ProgressDialogC83990a f187502a;

    /* renamed from: b */
    public ConcurrentHashMap<String, Integer> f187503b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public final SafeHandler f187504c;

    /* renamed from: d */
    public RecordPresetResource f187505d;

    /* renamed from: e */
    public long f187506e;

    /* renamed from: f */
    public long f187507f;

    /* renamed from: g */
    public boolean f187508g;

    /* renamed from: h */
    final String f187509h;

    /* renamed from: i */
    public C83993a f187510i;

    /* renamed from: j */
    public C83993a f187511j;

    /* renamed from: k */
    public final ActivityC0218d f187512k;

    /* renamed from: l */
    public final ShortVideoContext f187513l;

    /* renamed from: m */
    public final AbstractC84089j f187514m;

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.b$b */
    public interface AbstractC83994b {
        static {
            Covode.recordClassIndex(97887);
        }

        /* renamed from: a */
        void mo128881a();

        /* renamed from: a */
        void mo128882a(C69905c cVar);

        /* renamed from: a */
        void mo128883a(C69905c cVar, String str);

        /* renamed from: a */
        void mo128884a(Effect effect);

        /* renamed from: b */
        void mo128885b();

        /* renamed from: b */
        void mo128886b(Effect effect);

        /* renamed from: c */
        void mo128887c();

        /* renamed from: d */
        void mo128888d();

        /* renamed from: e */
        void mo128889e();
    }

    static {
        Covode.recordClassIndex(97885);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.b$c */
    static final class C83995c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C83995c f187521a = new C83995c();

        static {
            Covode.recordClassIndex(97888);
        }

        C83995c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.b$o */
    public static final class C84007o extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C84007o f187543a = new C84007o();

        static {
            Covode.recordClassIndex(97900);
        }

        C84007o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo128868a(Effect effect, AbstractC83994b bVar) {
        C75346e.m132159a(this.f187514m, C89070n.m154516a(effect), true, true, new C83997e(this, bVar), 0, null, 232);
    }

    /* renamed from: a */
    public final void mo128870a(String str, AbstractC89172b<? super C69905c, C89391z> bVar) {
        C63238c.f143581h.mo101746a(str, new C84001i(this, bVar));
    }

    /* renamed from: a */
    public final void mo128869a(String str, int i) {
        if (!this.f187503b.isEmpty()) {
            if (this.f187503b.containsKey(str)) {
                this.f187503b.put(str, Integer.valueOf(i));
            }
            int i2 = 0;
            for (Integer num : this.f187503b.values()) {
                C89219l.m154716b(num, "");
                i2 += num.intValue();
            }
            ProgressDialogC83990a aVar = this.f187502a;
            if (aVar != null) {
                aVar.setProgress(i2 / this.f187503b.size());
            }
        }
    }

    /* renamed from: a */
    public final void mo128867a(Effect effect) {
        Boolean bool = this.f187513l.f155760U;
        C89219l.m154716b(bool, "");
        if (bool.booleanValue()) {
            this.f187514m.mo128909f(true);
            FaceStickerBean.sCurPropSource = "qa_prop";
        }
        C75346e.m132159a(this.f187514m, C89070n.m154516a(effect), true, true, null, 0, null, 504);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.b$h */
    public static final class C84000h implements AbstractC63191aq {

        /* renamed from: a */
        final /* synthetic */ C83992b f187531a;

        /* renamed from: b */
        final /* synthetic */ AbstractC83994b f187532b;

        static {
            Covode.recordClassIndex(97893);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63191aq
        /* renamed from: a */
        public final void mo101642a() {
            this.f187532b.mo128887c();
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63191aq
        /* renamed from: a */
        public final void mo101643a(C69905c cVar) {
            if (cVar == null) {
                this.f187532b.mo128887c();
            } else if ((!AVCommerceServiceImpl.m102988h().mo93962a() || cVar.isCommerceMusic()) && C63238c.f143581h.mo101747a(cVar, this.f187531a.f187512k, false)) {
                this.f187532b.mo128882a(cVar);
            } else {
                this.f187532b.mo128888d();
            }
        }

        C84000h(C83992b bVar, AbstractC83994b bVar2) {
            this.f187531a = bVar;
            this.f187532b = bVar2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo128875d() {
        return this.f187503b.containsKey("music");
    }

    /* renamed from: e */
    public final boolean mo128876e() {
        return this.f187503b.containsKey("effect");
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.b$a */
    public static final class C83993a {

        /* renamed from: a */
        public Effect f187515a;

        /* renamed from: b */
        public C69905c f187516b;

        /* renamed from: c */
        public String f187517c;

        /* renamed from: d */
        public boolean f187518d;

        /* renamed from: e */
        public boolean f187519e;

        /* renamed from: f */
        public boolean f187520f;

        static {
            Covode.recordClassIndex(97886);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C83993a)) {
                return false;
            }
            C83993a aVar = (C83993a) obj;
            return C89219l.m154714a(this.f187515a, aVar.f187515a) && C89219l.m154714a(this.f187516b, aVar.f187516b) && C89219l.m154714a(this.f187517c, aVar.f187517c) && this.f187518d == aVar.f187518d && this.f187519e == aVar.f187519e && this.f187520f == aVar.f187520f;
        }

        public final int hashCode() {
            Effect effect = this.f187515a;
            int i = 0;
            int hashCode = (effect != null ? effect.hashCode() : 0) * 31;
            C69905c cVar = this.f187516b;
            int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
            String str = this.f187517c;
            if (str != null) {
                i = str.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.f187518d;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = (i2 + i4) * 31;
            boolean z2 = this.f187519e;
            if (z2) {
                z2 = true;
            }
            int i8 = z2 ? 1 : 0;
            int i9 = z2 ? 1 : 0;
            int i10 = z2 ? 1 : 0;
            int i11 = (i7 + i8) * 31;
            if (!this.f187520f) {
                i3 = 0;
            }
            return i11 + i3;
        }

        public final String toString() {
            return "LoadResult(effect=" + this.f187515a + ", avMusic=" + this.f187516b + ", musicFile=" + this.f187517c + ", musicDone=" + this.f187518d + ", effectDone=" + this.f187519e + ", musicInvalid=" + this.f187520f + ")";
        }

        private C83993a() {
            this.f187515a = null;
            this.f187516b = null;
            this.f187517c = null;
            this.f187518d = false;
            this.f187519e = false;
            this.f187520f = false;
        }

        public /* synthetic */ C83993a(byte b) {
            this();
        }
    }

    /* renamed from: h */
    private final void m144468h() {
        if (!this.f187508g) {
            new C23144b(this.f187512k).mo37640e(R.string.auf).mo37637b();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.b$l */
    public static final class C84004l implements AbstractC83994b {

        /* renamed from: a */
        final /* synthetic */ C83992b f187539a;

        static {
            Covode.recordClassIndex(97897);
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b.AbstractC83994b
        /* renamed from: a */
        public final void mo128881a() {
            if (!this.f187539a.f187508g) {
                this.f187539a.f187510i.f187519e = true;
                this.f187539a.f187510i.f187515a = null;
                this.f187539a.mo128863a(System.currentTimeMillis() - this.f187539a.f187507f, 0, "effect");
                this.f187539a.mo128862a();
            }
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b.AbstractC83994b
        /* renamed from: b */
        public final void mo128885b() {
            if (!this.f187539a.f187508g) {
                this.f187539a.f187510i.f187519e = true;
                this.f187539a.f187510i.f187515a = null;
                this.f187539a.mo128863a(System.currentTimeMillis() - this.f187539a.f187507f, 0, "effect");
                this.f187539a.mo128862a();
            }
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b.AbstractC83994b
        /* renamed from: c */
        public final void mo128887c() {
            if (!this.f187539a.f187508g) {
                this.f187539a.f187510i.f187518d = true;
                this.f187539a.f187510i.f187516b = null;
                this.f187539a.f187510i.f187517c = null;
                this.f187539a.mo128863a(System.currentTimeMillis() - this.f187539a.f187506e, 0, "music");
                this.f187539a.mo128862a();
            }
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b.AbstractC83994b
        /* renamed from: d */
        public final void mo128888d() {
            if (!this.f187539a.f187508g) {
                this.f187539a.f187510i.f187518d = true;
                this.f187539a.f187510i.f187516b = null;
                this.f187539a.f187510i.f187517c = null;
                this.f187539a.f187510i.f187520f = true;
                this.f187539a.mo128862a();
            }
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b.AbstractC83994b
        /* renamed from: e */
        public final void mo128889e() {
            if (!this.f187539a.f187508g) {
                this.f187539a.f187510i.f187518d = true;
                this.f187539a.f187510i.f187516b = null;
                this.f187539a.f187510i.f187517c = null;
                this.f187539a.mo128863a(System.currentTimeMillis() - this.f187539a.f187506e, 0, "music");
                this.f187539a.mo128862a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C84004l(C83992b bVar) {
            this.f187539a = bVar;
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b.AbstractC83994b
        /* renamed from: a */
        public final void mo128882a(C69905c cVar) {
            C89219l.m154721d(cVar, "");
            if (!this.f187539a.f187508g) {
                String a = C83992b.m144464a(cVar);
                if (a != null) {
                    mo128883a(cVar, a);
                } else {
                    this.f187539a.mo128864a(cVar, this);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b.AbstractC83994b
        /* renamed from: b */
        public final void mo128886b(Effect effect) {
            C89219l.m154721d(effect, "");
            if (!this.f187539a.f187508g) {
                this.f187539a.mo128869a("effect", 100);
                this.f187539a.f187510i.f187519e = true;
                this.f187539a.f187510i.f187515a = effect;
                this.f187539a.mo128863a(System.currentTimeMillis() - this.f187539a.f187507f, 1, "effect");
                this.f187539a.mo128862a();
            }
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b.AbstractC83994b
        /* renamed from: a */
        public final void mo128884a(Effect effect) {
            C89219l.m154721d(effect, "");
            if (!this.f187539a.f187508g) {
                this.f187539a.mo128868a(effect, this);
            }
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b.AbstractC83994b
        /* renamed from: a */
        public final void mo128883a(C69905c cVar, String str) {
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(str, "");
            if (!this.f187539a.f187508g) {
                this.f187539a.mo128869a("music", 100);
                this.f187539a.f187510i.f187518d = true;
                this.f187539a.f187510i.f187516b = cVar;
                this.f187539a.f187510i.f187517c = str;
                this.f187539a.mo128863a(System.currentTimeMillis() - this.f187539a.f187506e, 1, "music");
                this.f187539a.mo128862a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.b$m */
    public static final class C84005m implements AbstractC83994b {

        /* renamed from: a */
        final /* synthetic */ C83992b f187540a;

        /* renamed from: b */
        final /* synthetic */ RecordPresetResource f187541b;

        static {
            Covode.recordClassIndex(97898);
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b.AbstractC83994b
        /* renamed from: a */
        public final void mo128881a() {
            if (!this.f187540a.f187508g) {
                this.f187540a.f187510i.f187519e = true;
                this.f187540a.f187510i.f187515a = null;
                this.f187540a.mo128863a(System.currentTimeMillis() - this.f187540a.f187507f, 0, "effect");
                this.f187540a.mo128862a();
            }
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b.AbstractC83994b
        /* renamed from: b */
        public final void mo128885b() {
            if (!this.f187540a.f187508g) {
                this.f187540a.f187510i.f187519e = true;
                this.f187540a.f187510i.f187515a = null;
                this.f187540a.mo128863a(System.currentTimeMillis() - this.f187540a.f187507f, 0, "effect");
                this.f187540a.mo128862a();
            }
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b.AbstractC83994b
        /* renamed from: d */
        public final void mo128888d() {
            if (!this.f187540a.f187508g) {
                this.f187540a.f187510i.f187518d = true;
                this.f187540a.f187510i.f187516b = null;
                this.f187540a.f187510i.f187517c = null;
                this.f187540a.f187510i.f187520f = true;
                if (this.f187540a.mo128876e()) {
                    this.f187540a.mo128866a(this.f187541b, this);
                } else {
                    this.f187540a.mo128862a();
                }
            }
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b.AbstractC83994b
        /* renamed from: c */
        public final void mo128887c() {
            if (!this.f187540a.f187508g) {
                this.f187540a.f187510i.f187518d = true;
                this.f187540a.f187510i.f187516b = null;
                this.f187540a.f187510i.f187517c = null;
                this.f187540a.mo128863a(System.currentTimeMillis() - this.f187540a.f187506e, 0, "music");
                if (this.f187540a.mo128876e()) {
                    this.f187540a.mo128866a(this.f187541b, this);
                } else {
                    this.f187540a.mo128862a();
                }
            }
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b.AbstractC83994b
        /* renamed from: e */
        public final void mo128889e() {
            if (!this.f187540a.f187508g) {
                this.f187540a.f187510i.f187518d = true;
                this.f187540a.f187510i.f187516b = null;
                this.f187540a.f187510i.f187517c = null;
                this.f187540a.mo128863a(System.currentTimeMillis() - this.f187540a.f187506e, 0, "music");
                if (this.f187540a.mo128876e()) {
                    this.f187540a.mo128866a(this.f187541b, this);
                } else {
                    this.f187540a.mo128862a();
                }
            }
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b.AbstractC83994b
        /* renamed from: a */
        public final void mo128882a(C69905c cVar) {
            C89219l.m154721d(cVar, "");
            if (!this.f187540a.f187508g) {
                String a = C83992b.m144464a(cVar);
                if (a != null) {
                    mo128883a(cVar, a);
                } else {
                    this.f187540a.mo128864a(cVar, this);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b.AbstractC83994b
        /* renamed from: b */
        public final void mo128886b(Effect effect) {
            C89219l.m154721d(effect, "");
            if (!this.f187540a.f187508g) {
                this.f187540a.mo128869a("effect", 100);
                this.f187540a.f187510i.f187519e = true;
                this.f187540a.f187510i.f187515a = effect;
                this.f187540a.mo128863a(System.currentTimeMillis() - this.f187540a.f187507f, 1, "effect");
                this.f187540a.mo128862a();
            }
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b.AbstractC83994b
        /* renamed from: a */
        public final void mo128884a(Effect effect) {
            C89219l.m154721d(effect, "");
            if (!this.f187540a.f187508g) {
                this.f187540a.mo128868a(effect, this);
            }
        }

        C84005m(C83992b bVar, RecordPresetResource recordPresetResource) {
            this.f187540a = bVar;
            this.f187541b = recordPresetResource;
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b.AbstractC83994b
        /* renamed from: a */
        public final void mo128883a(C69905c cVar, String str) {
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(str, "");
            if (!this.f187540a.f187508g) {
                this.f187540a.mo128869a("music", 100);
                this.f187540a.f187510i.f187518d = true;
                this.f187540a.f187510i.f187516b = cVar;
                this.f187540a.f187510i.f187517c = str;
                this.f187540a.mo128863a(System.currentTimeMillis() - this.f187540a.f187506e, 1, "music");
                if (this.f187540a.mo128876e()) {
                    this.f187540a.mo128866a(this.f187541b, this);
                } else {
                    this.f187540a.mo128862a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.b$p */
    public static final class RunnableC84008p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C83992b f187544a;

        static {
            Covode.recordClassIndex(97901);
        }

        public RunnableC84008p(C83992b bVar) {
            this.f187544a = bVar;
        }

        public final void run() {
            int i;
            ProgressDialogC83990a aVar = this.f187544a.f187502a;
            if (aVar != null) {
                Boolean bool = true;
                TuxIconView tuxIconView = (TuxIconView) aVar.findViewById(R.id.bhe);
                if (tuxIconView != null) {
                    if (bool.booleanValue()) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    tuxIconView.setVisibility(i);
                }
            }
            ProgressDialogC83990a aVar2 = this.f187544a.f187502a;
            if (aVar2 != null) {
                View$OnClickListenerC840091 r1 = new View.OnClickListener(this) {
                    /* class com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4313b.C83992b.RunnableC84008p.View$OnClickListenerC840091 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC84008p f187545a;

                    static {
                        Covode.recordClassIndex(97902);
                    }

                    {
                        this.f187545a = r1;
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        C83992b bVar = this.f187545a.f187544a;
                        bVar.f187508g = true;
                        ProgressDialogC83990a aVar = bVar.f187502a;
                        if (aVar != null) {
                            aVar.mo128859a(C83995c.f187521a);
                        }
                        RecordPresetResource recordPresetResource = bVar.f187505d;
                        if (recordPresetResource == null) {
                            C89219l.m154710a("recordPresetResource");
                        }
                        bVar.mo128873c(recordPresetResource);
                        bVar.f187510i.f187518d = true;
                        bVar.f187510i.f187519e = true;
                        bVar.mo128862a();
                        RecordPresetResource recordPresetResource2 = bVar.f187505d;
                        if (recordPresetResource2 == null) {
                            C89219l.m154710a("recordPresetResource");
                        }
                        C39162r.m79460a("click_cancel_loading", new C84425b().mo129406a("enter_from", "video_shoot_page").mo129406a("shoot_way", bVar.f187513l.f155831p).mo129406a("content_source", bVar.f187513l.mo110034j().getContentSource()).mo129406a("content_type", bVar.f187513l.mo110034j().getContentType()).mo129406a("creation_id", bVar.f187513l.f155830o).mo129406a("group_id", C70747dv.m124972a()).mo129406a("music_id", C83992b.m144465a(recordPresetResource2)).mo129406a("musci_id", C83992b.m144466b(recordPresetResource2)).f188764a);
                    }
                };
                TuxIconView tuxIconView2 = (TuxIconView) aVar2.findViewById(R.id.bhe);
                if (tuxIconView2 != null) {
                    tuxIconView2.setOnClickListener(r1);
                }
            }
        }
    }

    /* renamed from: g */
    private final void m144467g() {
        Effect effect = this.f187511j.f187515a;
        if (effect != null) {
            mo128867a(effect);
        }
        if (this.f187511j.f187516b != null && this.f187511j.f187517c != null) {
            C69905c cVar = this.f187511j.f187516b;
            if (cVar == null) {
                C89219l.m154715b();
            }
            String str = this.f187511j.f187517c;
            if (str == null) {
                C89219l.m154715b();
            }
            mo128865a(cVar, str);
        }
    }

    /* renamed from: i */
    private final void m144469i() {
        if (!this.f187508g && C89070n.m154522b("prop_page", "prop_reuse", "anchor_combine_prop", "scan").contains(this.f187513l.f155831p)) {
            new C23144b(this.f187512k).mo37640e(R.string.aud).mo37637b();
        }
    }

    /* renamed from: j */
    private final void m144470j() {
        if (!this.f187508g && C89070n.m154522b("single_song", "collection_music", "draft_again").contains(this.f187513l.f155831p)) {
            new C23144b(this.f187512k).mo37640e(R.string.aue).mo37637b();
        }
    }

    /* renamed from: c */
    public final boolean mo128874c() {
        RecordPresetResource recordPresetResource = this.f187505d;
        if (recordPresetResource == null) {
            C89219l.m154710a("recordPresetResource");
        }
        if (!TextUtils.isEmpty(recordPresetResource.getEffectId())) {
            return true;
        }
        RecordPresetResource recordPresetResource2 = this.f187505d;
        if (recordPresetResource2 == null) {
            C89219l.m154710a("recordPresetResource");
        }
        if (recordPresetResource2.getEffect() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final Map<String, String> mo128877f() {
        boolean z;
        HashMap hashMap = new HashMap();
        ActivityC0218d dVar = this.f187512k;
        if (!(dVar instanceof VideoRecordNewActivity)) {
            dVar = null;
        }
        VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) dVar;
        if (videoRecordNewActivity != null) {
            String str = videoRecordNewActivity.f164823r;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String str2 = videoRecordNewActivity.f164823r;
                C89219l.m154716b(str2, "");
                hashMap.put("scene", str2);
            }
            String str3 = videoRecordNewActivity.f164824s;
            if (!(str3 == null || str3.length() == 0)) {
                String str4 = videoRecordNewActivity.f164824s;
                C89219l.m154716b(str4, "");
                hashMap.put("grade_key", str4);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo128862a() {
        boolean z;
        if (mo128876e() && !this.f187510i.f187519e) {
            return;
        }
        if (!mo128875d() || this.f187510i.f187518d) {
            ProgressDialogC83990a aVar = this.f187502a;
            if (aVar != null) {
                aVar.mo128859a(C84007o.f187543a);
            }
            C69905c cVar = this.f187510i.f187516b;
            String str = this.f187510i.f187517c;
            Effect effect = this.f187510i.f187515a;
            boolean z2 = true;
            if (cVar == null || str == null) {
                z = false;
            } else {
                z = true;
            }
            if (effect == null) {
                z2 = false;
            }
            boolean c = mo128874c();
            boolean b = mo128872b();
            m144467g();
            if ((!mo128876e() || !z2) && (!mo128875d() || !z)) {
                RecordPresetResource recordPresetResource = this.f187505d;
                if (recordPresetResource == null) {
                    C89219l.m154710a("recordPresetResource");
                }
                mo128873c(recordPresetResource);
                if (c) {
                    if (!b) {
                        m144469i();
                        return;
                    }
                } else if (b) {
                    m144470j();
                    return;
                }
                if (mo128875d() && mo128876e()) {
                    m144468h();
                } else if (mo128875d() && !mo128876e()) {
                    m144470j();
                } else if (mo128876e() && !mo128875d()) {
                    m144469i();
                }
            } else {
                if (mo128876e()) {
                    if (effect != null) {
                        mo128867a(effect);
                    } else {
                        RecordPresetResource recordPresetResource2 = this.f187505d;
                        if (recordPresetResource2 == null) {
                            C89219l.m154710a("recordPresetResource");
                        }
                        mo128873c(recordPresetResource2);
                        m144469i();
                    }
                }
                if (!mo128875d()) {
                    return;
                }
                if (cVar != null && str != null) {
                    mo128865a(cVar, str);
                } else if (!this.f187510i.f187520f) {
                    RecordPresetResource recordPresetResource3 = this.f187505d;
                    if (recordPresetResource3 == null) {
                        C89219l.m154710a("recordPresetResource");
                    }
                    mo128873c(recordPresetResource3);
                    m144470j();
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo128872b() {
        RecordPresetResource recordPresetResource = this.f187505d;
        if (recordPresetResource == null) {
            C89219l.m154710a("recordPresetResource");
        }
        if (!TextUtils.isEmpty(recordPresetResource.getMusicId())) {
            return true;
        }
        RecordPresetResource recordPresetResource2 = this.f187505d;
        if (recordPresetResource2 == null) {
            C89219l.m154710a("recordPresetResource");
        }
        if (recordPresetResource2.getMusicModel() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.b$f */
    public static final class C83998f implements AbstractC63257p.AbstractC63258a {

        /* renamed from: a */
        final /* synthetic */ C83992b f187527a;

        /* renamed from: b */
        final /* synthetic */ AbstractC83994b f187528b;

        /* renamed from: c */
        final /* synthetic */ C69905c f187529c;

        static {
            Covode.recordClassIndex(97891);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p.AbstractC63258a
        /* renamed from: a */
        public final void mo101753a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p.AbstractC63258a
        /* renamed from: a */
        public final void mo101754a(int i) {
            this.f187527a.mo128869a("music", i);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p.AbstractC63258a
        /* renamed from: a */
        public final void mo101756a(String str) {
            C89219l.m154721d(str, "");
            this.f187528b.mo128883a(this.f187529c, str);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p.AbstractC63258a
        /* renamed from: a */
        public final void mo101755a(Integer num, String str) {
            this.f187528b.mo128889e();
        }

        C83998f(C83992b bVar, AbstractC83994b bVar2, C69905c cVar) {
            this.f187527a = bVar;
            this.f187528b = bVar2;
            this.f187529c = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.b$g */
    public static final class C83999g implements IFetchEffectListByIdsListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC83994b f187530a;

        static {
            Covode.recordClassIndex(97892);
        }

        C83999g(AbstractC83994b bVar) {
            this.f187530a = bVar;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
        public final void onFail(ExceptionResult exceptionResult) {
            this.f187530a.mo128887c();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
            List<Effect> data;
            Effect effect;
            EffectListResponse effectListResponse2 = effectListResponse;
            if (effectListResponse2 == null || (data = effectListResponse2.getData()) == null || (effect = data.get(0)) == null) {
                this.f187530a.mo128881a();
            } else {
                this.f187530a.mo128884a(effect);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.b$n */
    public static final class C84006n implements IFetchEffectListByIdsListener {

        /* renamed from: a */
        final /* synthetic */ C83992b f187542a;

        static {
            Covode.recordClassIndex(97899);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
        public final void onFail(ExceptionResult exceptionResult) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C84006n(C83992b bVar) {
            this.f187542a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
            List<Effect> data;
            Effect effect;
            EffectListResponse effectListResponse2 = effectListResponse;
            if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null && (effect = data.get(0)) != null) {
                C75346e.m132159a(this.f187542a.f187514m, C89070n.m154516a(effect), true, false, null, 0, null, 504);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.b$e */
    public static final class C83997e implements AbstractC75374c.AbstractC75375a {

        /* renamed from: a */
        final /* synthetic */ C83992b f187525a;

        /* renamed from: b */
        final /* synthetic */ AbstractC83994b f187526b;

        static {
            Covode.recordClassIndex(97890);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75375a
        /* renamed from: c */
        public final void mo118621c(Effect effect) {
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75375a
        /* renamed from: b */
        public final void mo118620b(Effect effect) {
            if (effect != null) {
                this.f187526b.mo128886b(effect);
            } else {
                this.f187526b.mo128885b();
            }
        }

        C83997e(C83992b bVar, AbstractC83994b bVar2) {
            this.f187525a = bVar;
            this.f187526b = bVar2;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75375a
        /* renamed from: a */
        public final void mo118618a(Effect effect, int i) {
            this.f187525a.mo128869a("effect", i);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75375a
        /* renamed from: a */
        public final void mo118619a(Effect effect, ExceptionResult exceptionResult) {
            this.f187526b.mo128885b();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.b$k */
    public static final class C84003k implements IAVEffectService.IAVEffectReadyCallback<AbstractC46415f> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f187537a;

        /* renamed from: b */
        final /* synthetic */ Effect f187538b;

        static {
            Covode.recordClassIndex(97896);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
        public final /* synthetic */ void finish(AbstractC46415f fVar) {
            AbstractC46415f fVar2 = fVar;
            if (fVar2 != null) {
                this.f187537a.element = fVar2.mo78918c(this.f187538b);
            }
        }

        public C84003k(C89233z.C89234a aVar, Effect effect) {
            this.f187537a = aVar;
            this.f187538b = effect;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ RecordPresetResource m144463a(C83992b bVar) {
        RecordPresetResource recordPresetResource = bVar.f187505d;
        if (recordPresetResource == null) {
            C89219l.m154710a("recordPresetResource");
        }
        return recordPresetResource;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.b$d */
    public static final class C83996d extends AbstractC89220m implements AbstractC89172b<C69905c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83992b f187522a;

        /* renamed from: b */
        final /* synthetic */ C69905c f187523b;

        /* renamed from: c */
        final /* synthetic */ String f187524c;

        static {
            Covode.recordClassIndex(97889);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83996d(C83992b bVar, C69905c cVar, String str) {
            super(1);
            this.f187522a = bVar;
            this.f187523b = cVar;
            this.f187524c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C69905c cVar) {
            C89219l.m154721d(cVar, "");
            this.f187522a.f187511j.f187516b = this.f187523b;
            this.f187522a.f187511j.f187517c = this.f187524c;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.b$j */
    public static final class C84002j extends AbstractC89220m implements AbstractC89172b<C69905c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f187535a;

        /* renamed from: b */
        final /* synthetic */ C83992b f187536b;

        static {
            Covode.recordClassIndex(97895);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84002j(String str, C83992b bVar) {
            super(1);
            this.f187535a = str;
            this.f187536b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C69905c cVar) {
            C69905c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            this.f187536b.mo128865a(cVar2, this.f187535a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static String m144464a(C69905c cVar) {
        if (cVar == null) {
            return null;
        }
        String b = C63238c.f143581h.mo101748b(cVar);
        if (new File(b).exists()) {
            return b;
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.b$i */
    public static final class C84001i implements AbstractC63191aq {

        /* renamed from: a */
        final /* synthetic */ C83992b f187533a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f187534b;

        static {
            Covode.recordClassIndex(97894);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63191aq
        /* renamed from: a */
        public final void mo101642a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63191aq
        /* renamed from: a */
        public final void mo101643a(C69905c cVar) {
            if (cVar == null) {
                return;
            }
            if ((!AVCommerceServiceImpl.m102988h().mo93962a() || cVar.isCommerceMusic()) && C63238c.f143581h.mo101747a(cVar, this.f187533a.f187512k, false)) {
                this.f187534b.invoke(cVar);
            }
        }

        C84001i(C83992b bVar, AbstractC89172b bVar2) {
            this.f187533a = bVar;
            this.f187534b = bVar2;
        }
    }

    /* renamed from: a */
    static String m144465a(RecordPresetResource recordPresetResource) {
        String str;
        String musicId = recordPresetResource.getMusicId();
        MusicModel musicModel = recordPresetResource.getMusicModel();
        if (!TextUtils.isEmpty(musicId)) {
            return musicId;
        }
        if (musicModel != null) {
            str = musicModel.getMusicId();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return musicId;
        }
        if (musicModel != null) {
            return musicModel.getMusicId();
        }
        return null;
    }

    /* renamed from: b */
    static String m144466b(RecordPresetResource recordPresetResource) {
        String str;
        String effectId = recordPresetResource.getEffectId();
        Effect effect = recordPresetResource.getEffect();
        if (!TextUtils.isEmpty(effectId)) {
            return effectId;
        }
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return effectId;
        }
        if (effect != null) {
            return effect.getEffectId();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo128873c(RecordPresetResource recordPresetResource) {
        if (recordPresetResource != null) {
            Effect effect = recordPresetResource.getEffect();
            String effectId = recordPresetResource.getEffectId();
            if (effect != null) {
                C75346e.m132159a(this.f187514m, C89070n.m154516a(effect), true, false, null, 0, null, 504);
            } else if (effectId != null) {
                C75346e.m132158a(this.f187514m, C89070n.m154516a(effectId), mo128877f(), new C84006n(this));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.b$q */
    public static final class C84010q extends AbstractC89220m implements AbstractC89172b<Effect, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83992b f187546a;

        static {
            Covode.recordClassIndex(97903);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84010q(C83992b bVar) {
            super(1);
            this.f187546a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Effect effect) {
            String str;
            Effect effect2 = effect;
            RecordPresetResource a = C83992b.m144463a(this.f187546a);
            if (effect2 != null) {
                str = effect2.getEffectId();
            } else {
                str = null;
            }
            a.setEffectId(str);
            C83992b.m144463a(this.f187546a).setEffect(effect2);
            this.f187546a.f187513l.f155759T = C83992b.m144463a(this.f187546a);
            C83992b bVar = this.f187546a;
            RecordPresetResource a2 = C83992b.m144463a(bVar);
            if (C89219l.m154714a((Object) bVar.f187509h, (Object) "load_serial")) {
                C84005m mVar = new C84005m(bVar, a2);
                if (bVar.mo128875d()) {
                    bVar.mo128871b(a2, mVar);
                } else {
                    bVar.mo128866a(a2, mVar);
                }
            } else if (C89219l.m154714a((Object) bVar.f187509h, (Object) "load_parallel")) {
                C84004l lVar = new C84004l(bVar);
                if (bVar.mo128875d()) {
                    bVar.mo128871b(a2, lVar);
                }
                if (bVar.mo128876e()) {
                    bVar.mo128866a(a2, lVar);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo128864a(C69905c cVar, AbstractC83994b bVar) {
        C63238c.f143581h.mo101744a(this.f187512k, cVar, 6, new C83998f(this, bVar, cVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo128871b(RecordPresetResource recordPresetResource, AbstractC83994b bVar) {
        String str;
        String musicId = recordPresetResource.getMusicId();
        MusicModel musicModel = recordPresetResource.getMusicModel();
        if (TextUtils.isEmpty(musicId)) {
            if (musicModel != null) {
                str = musicModel.getMusicId();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                musicId = musicModel != null ? musicModel.getMusicId() : null;
            }
        }
        this.f187506e = System.currentTimeMillis();
        if (musicId == null || musicId.length() == 0) {
            this.f187510i.f187518d = true;
            this.f187510i.f187516b = null;
            this.f187510i.f187517c = null;
            mo128863a(System.currentTimeMillis() - this.f187506e, 0, "music");
            mo128862a();
            return;
        }
        C63238c.f143581h.mo101746a(musicId, new C84000h(this, bVar));
    }

    /* renamed from: a */
    public final void mo128865a(C69905c cVar, String str) {
        AbstractC83490a aVar = (AbstractC83490a) ApiCenter.C2545a.m7450a(this.f187512k).mo7015b(AbstractC83490a.class);
        if (aVar != null) {
            aVar.onChooseMusicDone(false, "", cVar, str);
            aVar.handleChooseMusic(C40888d.C40889a.m82358a(false, "", cVar, str));
        }
        C70005cr.m123611a().mo70083a(cVar);
    }

    /* renamed from: a */
    public final void mo128866a(RecordPresetResource recordPresetResource, AbstractC83994b bVar) {
        String str;
        String effectId = recordPresetResource.getEffectId();
        Effect effect = recordPresetResource.getEffect();
        if (TextUtils.isEmpty(effectId)) {
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                effectId = effect != null ? effect.getEffectId() : null;
            }
        }
        this.f187507f = System.currentTimeMillis();
        if (effect != null) {
            mo128868a(effect, bVar);
        } else if (effectId == null || effectId.length() == 0) {
            this.f187510i.f187519e = true;
            this.f187510i.f187515a = null;
            mo128863a(System.currentTimeMillis() - this.f187507f, 0, "effect");
            mo128862a();
        } else {
            C75346e.m132158a(this.f187514m, C89070n.m154516a(effectId), mo128877f(), new C83999g(bVar));
        }
    }

    public C83992b(ActivityC0218d dVar, ShortVideoContext shortVideoContext, AbstractC84089j jVar) {
        String str;
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(jVar, "");
        this.f187512k = dVar;
        this.f187513l = shortVideoContext;
        this.f187514m = jVar;
        this.f187504c = new SafeHandler(dVar);
        if (C65503z.m117231a() == 1) {
            str = "load_serial";
        } else {
            str = "load_parallel";
        }
        this.f187509h = str;
        this.f187510i = new C83993a((byte) 0);
        this.f187511j = new C83993a((byte) 0);
    }

    /* renamed from: a */
    public final void mo128863a(long j, int i, String str) {
        RecordPresetResource recordPresetResource = this.f187505d;
        if (recordPresetResource == null) {
            C89219l.m154710a("recordPresetResource");
        }
        C39162r.m79460a("loading_finish", new C84425b().mo129406a("enter_from", "video_shoot_page").mo129406a("shoot_way", this.f187513l.f155831p).mo129406a("content_source", this.f187513l.mo110034j().getContentSource()).mo129406a("content_type", this.f187513l.mo110034j().getContentType()).mo129406a("creation_id", this.f187513l.f155830o).mo129406a("group_id", C70747dv.m124972a()).mo129406a("music_id", m144465a(recordPresetResource)).mo129406a("musci_id", m144466b(recordPresetResource)).mo129404a("loading_duration", j).mo129403a("loading_status", i).mo129406a("loading_type", str).f188764a);
    }
}
