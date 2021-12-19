package com.p2082ss.android.ugc.aweme.infoSticker.customsticker;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.C20524n;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.retrofit2.mime.TypedFile;
import com.p2082ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.api.C56713a;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.api.CustomStickerApi;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.api.CustomStickerNetInterceptor;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutData;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutResponse;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.helper.C56714a;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.tools.utils.C84891c;
import java.io.File;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel */
public final class EditPreviewStickerViewModel extends BaseJediViewModel<EditPreviewStickerState> {

    /* renamed from: c */
    public static final C56662a f129136c = new C56662a((byte) 0);

    /* renamed from: a */
    public C88411a f129137a;

    /* renamed from: b */
    final AbstractC89244h f129138b = C89250i.m154773a((AbstractC89171a) C56663b.f129139a);

    static {
        Covode.recordClassIndex(66511);
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel$a */
    public static final class C56662a {
        static {
            Covode.recordClassIndex(66512);
        }

        private C56662a() {
        }

        public /* synthetic */ C56662a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo93565a() {
        C88411a aVar = this.f129137a;
        if (aVar != null) {
            aVar.dispose();
        }
        mo33689c(C56664c.f129140a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new EditPreviewStickerState(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel$b */
    static final class C56663b extends AbstractC89220m implements AbstractC89171a<CustomStickerApi> {

        /* renamed from: a */
        public static final C56663b f129139a = new C56663b();

        static {
            Covode.recordClassIndex(66513);
        }

        C56663b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CustomStickerApi invoke() {
            AbstractC63196au C = C63244g.m114602a().mo73257C();
            String itemName = EffectPlatformFactory.m89604a().getHosts().get(0).getItemName();
            C89219l.m154716b(itemName, "");
            return C.createRetrofitWithInterceptors(itemName, true, CustomStickerApi.class, C89070n.m154516a(new CustomStickerNetInterceptor()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel$f */
    public static final class C56669f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ EditPreviewStickerViewModel f129148a;

        static {
            Covode.recordClassIndex(66519);
        }

        public C56669f(EditPreviewStickerViewModel editPreviewStickerViewModel) {
            this.f129148a = editPreviewStickerViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f129148a.mo93566a(new C56713a(null, 1, null));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel$c */
    public static final class C56664c extends AbstractC89220m implements AbstractC89172b<EditPreviewStickerState, EditPreviewStickerState> {

        /* renamed from: a */
        public static final C56664c f129140a = new C56664c();

        static {
            Covode.recordClassIndex(66514);
        }

        C56664c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditPreviewStickerState invoke(EditPreviewStickerState editPreviewStickerState) {
            EditPreviewStickerState editPreviewStickerState2 = editPreviewStickerState;
            C89219l.m154721d(editPreviewStickerState2, "");
            return EditPreviewStickerState.copy$default(editPreviewStickerState2, null, null, null, null, null, null, new C20526p(), null, null, 447, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel$h */
    static final class C56671h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ EditPreviewStickerViewModel f129151a;

        static {
            Covode.recordClassIndex(66521);
        }

        C56671h(EditPreviewStickerViewModel editPreviewStickerViewModel) {
            this.f129151a = editPreviewStickerViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            CutoutData cutoutData = (CutoutData) obj;
            EditPreviewStickerViewModel editPreviewStickerViewModel = this.f129151a;
            if (editPreviewStickerViewModel.f129137a != null) {
                C88411a aVar = editPreviewStickerViewModel.f129137a;
                if (aVar == null) {
                    C89219l.m154715b();
                }
                if (aVar.isDisposed()) {
                    return;
                }
            }
            editPreviewStickerViewModel.mo33689c(new C56674k(cutoutData));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel$i */
    static final class C56672i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ EditPreviewStickerViewModel f129152a;

        static {
            Covode.recordClassIndex(66522);
        }

        C56672i(EditPreviewStickerViewModel editPreviewStickerViewModel) {
            this.f129152a = editPreviewStickerViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th instanceof C56713a) {
                this.f129152a.mo93566a((C56713a) th);
            } else {
                this.f129152a.mo93566a(new C56713a(null, 1, null));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel$j */
    public static final class C56673j extends AbstractC89220m implements AbstractC89172b<EditPreviewStickerState, EditPreviewStickerState> {

        /* renamed from: a */
        final /* synthetic */ C56713a f129153a;

        static {
            Covode.recordClassIndex(66523);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56673j(C56713a aVar) {
            super(1);
            this.f129153a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditPreviewStickerState invoke(EditPreviewStickerState editPreviewStickerState) {
            EditPreviewStickerState editPreviewStickerState2 = editPreviewStickerState;
            C89219l.m154721d(editPreviewStickerState2, "");
            return EditPreviewStickerState.copy$default(editPreviewStickerState2, null, null, null, null, null, this.f129153a, null, null, null, 479, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel$k */
    static final class C56674k extends AbstractC89220m implements AbstractC89172b<EditPreviewStickerState, EditPreviewStickerState> {

        /* renamed from: a */
        final /* synthetic */ CutoutData f129154a;

        static {
            Covode.recordClassIndex(66524);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56674k(CutoutData cutoutData) {
            super(1);
            this.f129154a = cutoutData;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditPreviewStickerState invoke(EditPreviewStickerState editPreviewStickerState) {
            EditPreviewStickerState editPreviewStickerState2 = editPreviewStickerState;
            C89219l.m154721d(editPreviewStickerState2, "");
            return EditPreviewStickerState.copy$default(editPreviewStickerState2, null, null, null, null, null, null, null, this.f129154a, null, 383, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel$l */
    public static final class C56675l extends AbstractC89220m implements AbstractC89172b<EditPreviewStickerState, EditPreviewStickerState> {

        /* renamed from: a */
        final /* synthetic */ MediaModel f129155a;

        static {
            Covode.recordClassIndex(66525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56675l(MediaModel mediaModel) {
            super(1);
            this.f129155a = mediaModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditPreviewStickerState invoke(EditPreviewStickerState editPreviewStickerState) {
            EditPreviewStickerState editPreviewStickerState2 = editPreviewStickerState;
            C89219l.m154721d(editPreviewStickerState2, "");
            return EditPreviewStickerState.copy$default(editPreviewStickerState2, null, null, null, null, this.f129155a, null, null, null, null, 495, null);
        }
    }

    /* renamed from: a */
    public final void mo93566a(C56713a aVar) {
        mo33689c(new C56673j(aVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel$d */
    public static final class C56665d<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ EditPreviewStickerViewModel f129141a;

        /* renamed from: b */
        final /* synthetic */ String f129142b;

        /* renamed from: c */
        final /* synthetic */ int[] f129143c;

        static {
            Covode.recordClassIndex(66515);
        }

        public C56665d(EditPreviewStickerViewModel editPreviewStickerViewModel, String str, int[] iArr) {
            this.f129141a = editPreviewStickerViewModel;
            this.f129142b = str;
            this.f129143c = iArr;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<File> vVar) {
            C89219l.m154721d(vVar, "");
            Bitmap a = C84891c.m145844a(this.f129142b, this.f129143c);
            EditPreviewStickerViewModel editPreviewStickerViewModel = this.f129141a;
            C89219l.m154716b(a, "");
            editPreviewStickerViewModel.mo33689c(new C56676m(a.getWidth(), a.getHeight()));
            File a2 = C56714a.m102718a(a);
            if (a2 != null) {
                vVar.mo143031a(a2);
            } else {
                vVar.mo143104b(new IllegalStateException("Compress Error"));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel$e */
    public static final class C56666e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ EditPreviewStickerViewModel f129144a;

        static {
            Covode.recordClassIndex(66516);
        }

        public C56666e(EditPreviewStickerViewModel editPreviewStickerViewModel) {
            this.f129144a = editPreviewStickerViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final long currentTimeMillis = System.currentTimeMillis();
            ((CustomStickerApi) this.f129144a.f129138b.getValue()).cutoutSticker(new TypedFile("image/*", (File) obj)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel.C56666e.C566671 */

                /* renamed from: a */
                final /* synthetic */ C56666e f129145a;

                static {
                    Covode.recordClassIndex(66517);
                }

                {
                    this.f129145a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    CutoutResponse cutoutResponse = (CutoutResponse) obj;
                    EditPreviewStickerViewModel editPreviewStickerViewModel = this.f129145a.f129144a;
                    long j = currentTimeMillis;
                    C88411a aVar = editPreviewStickerViewModel.f129137a;
                    if (aVar == null || !aVar.isDisposed()) {
                        AbstractC88412b a = AbstractC88979t.m154294a(new C56670g(cutoutResponse, j)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C56671h(editPreviewStickerViewModel), new C56672i(editPreviewStickerViewModel));
                        C88411a aVar2 = editPreviewStickerViewModel.f129137a;
                        if (aVar2 != null) {
                            aVar2.mo142945a(a);
                        }
                    }
                }
            }, new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel.C56666e.C566682 */

                /* renamed from: a */
                final /* synthetic */ C56666e f129147a;

                static {
                    Covode.recordClassIndex(66518);
                }

                {
                    this.f129147a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    this.f129147a.f129144a.mo93566a(new C56713a(null, 1, null));
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel$m */
    static final class C56676m extends AbstractC89220m implements AbstractC89172b<EditPreviewStickerState, EditPreviewStickerState> {

        /* renamed from: a */
        final /* synthetic */ int f129156a;

        /* renamed from: b */
        final /* synthetic */ int f129157b;

        static {
            Covode.recordClassIndex(66526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56676m(int i, int i2) {
            super(1);
            this.f129156a = i;
            this.f129157b = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditPreviewStickerState invoke(EditPreviewStickerState editPreviewStickerState) {
            EditPreviewStickerState editPreviewStickerState2 = editPreviewStickerState;
            C89219l.m154721d(editPreviewStickerState2, "");
            return EditPreviewStickerState.copy$default(editPreviewStickerState2, null, null, null, null, null, null, null, null, new C20524n(C89387v.m154943a(Integer.valueOf(this.f129156a), Integer.valueOf(this.f129157b))), 255, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel$g */
    static final class C56670g<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ CutoutResponse f129149a;

        /* renamed from: b */
        final /* synthetic */ long f129150b;

        static {
            Covode.recordClassIndex(66520);
        }

        C56670g(CutoutResponse cutoutResponse, long j) {
            this.f129149a = cutoutResponse;
            this.f129150b = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x008e, code lost:
            if (r1 == null) goto L_0x0067;
         */
        @Override // p4560f.p4561a.AbstractC88983w
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void subscribe(p4560f.p4561a.AbstractC88982v<com.p2082ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutData> r9) {
            /*
            // Method dump skipped, instructions count: 165
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel.C56670g.subscribe(f.a.v):void");
        }
    }
}
