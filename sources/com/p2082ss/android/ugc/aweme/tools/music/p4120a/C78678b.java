package com.p2082ss.android.ugc.aweme.tools.music.p4120a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40891f;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tools.music.p4124c.AbstractC78743a;
import com.p2082ss.android.ugc.aweme.tools.music.p4128e.C78821b;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.a.b */
public final class C78678b {

    /* renamed from: c */
    public static final C78678b f176800c = C78680b.f176804a;

    /* renamed from: d */
    public static final C78679a f176801d = new C78679a((byte) 0);

    /* renamed from: a */
    public AbstractC78743a f176802a;

    /* renamed from: b */
    public AbstractC40891f f176803b;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.b$a */
    public static final class C78679a {
        static {
            Covode.recordClassIndex(91820);
        }

        private C78679a() {
        }

        public /* synthetic */ C78679a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.b$b */
    static final class C78680b {

        /* renamed from: a */
        static final C78678b f176804a = new C78678b();

        /* renamed from: b */
        public static final C78680b f176805b = new C78680b();

        private C78680b() {
        }

        static {
            Covode.recordClassIndex(91821);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.b$c */
    public static final class CallableC78681c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f176806a;

        static {
            Covode.recordClassIndex(91822);
        }

        CallableC78681c(String str) {
            this.f176806a = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return MusicService.m81198m().mo69293a(this.f176806a);
        }
    }

    static {
        Covode.recordClassIndex(91819);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.b$e */
    public static final class C78683e<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C78678b f176808a;

        /* renamed from: b */
        final /* synthetic */ List f176809b;

        static {
            Covode.recordClassIndex(91824);
        }

        public C78683e(C78678b bVar, List list) {
            this.f176808a = bVar;
            this.f176809b = list;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<MusicModel> vVar) {
            C89219l.m154721d(vVar, "");
            if (C84892d.m145850a(this.f176809b)) {
                vVar.mo143031a(new MusicModel());
                vVar.mo143023a();
                return;
            }
            C78678b bVar = this.f176808a;
            bVar.f176802a = new AbstractC78743a() {
                /* class com.p2082ss.android.ugc.aweme.tools.music.p4120a.C78678b.C78683e.C786841 */

                static {
                    Covode.recordClassIndex(91825);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.p2082ss.android.ugc.aweme.tools.music.p4124c.AbstractC78743a
                /* renamed from: a */
                public final void mo122542a(MusicModel musicModel, boolean z) {
                    if (musicModel != null) {
                        vVar.mo143031a(musicModel);
                        vVar.mo143023a();
                        return;
                    }
                    vVar.mo143031a(new MusicModel());
                    vVar.mo143023a();
                }
            };
            bVar.mo122552a(this.f176809b);
        }
    }

    /* renamed from: a */
    public final C78678b mo122552a(List<String> list) {
        if (C34717d.m70908a(list) || list == null) {
            AbstractC78743a aVar = this.f176802a;
            if (aVar != null) {
                aVar.mo122542a(null, false);
            }
            return this;
        }
        String str = list.get(0);
        if (TextUtils.isEmpty(str)) {
            AbstractC78743a aVar2 = this.f176802a;
            if (aVar2 != null) {
                aVar2.mo122542a(null, false);
            }
            return this;
        }
        C1731i.m5640b(new CallableC78681c(str), C1731i.f5562a).mo5534a(new C78682d(this), C1731i.f5564c, null);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.b$d */
    public static final class C78682d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C78678b f176807a;

        static {
            Covode.recordClassIndex(91823);
        }

        C78682d(C78678b bVar) {
            this.f176807a = bVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            AbstractC40891f fVar;
            if (this.f176807a.f176802a != null) {
                C89219l.m154716b(iVar, "");
                boolean z = false;
                C69905c cVar = null;
                if (iVar.mo5545d() != null) {
                    MusicModel convertToMusicModel = ((Music) iVar.mo5545d()).convertToMusicModel();
                    AbstractC40891f fVar2 = this.f176807a.f176803b;
                    if (fVar2 != null) {
                        cVar = fVar2.mo70084b();
                    }
                    if (cVar == null) {
                        z = true;
                    }
                    if (convertToMusicModel != null) {
                        convertToMusicModel.setMvThemeMusic(true);
                        if (z && (fVar = this.f176807a.f176803b) != null) {
                            fVar.mo70083a(C78821b.m137586a(convertToMusicModel));
                        }
                    }
                    AbstractC78743a aVar = this.f176807a.f176802a;
                    if (aVar == null) {
                        C89219l.m154715b();
                    }
                    aVar.mo122542a(convertToMusicModel, z);
                } else {
                    AbstractC78743a aVar2 = this.f176807a.f176802a;
                    if (aVar2 == null) {
                        C89219l.m154715b();
                    }
                    aVar2.mo122542a(null, false);
                }
            }
            return C89391z.f203057a;
        }
    }
}
