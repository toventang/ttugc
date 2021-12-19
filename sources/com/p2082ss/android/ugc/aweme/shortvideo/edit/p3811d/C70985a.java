package com.p2082ss.android.ugc.aweme.shortvideo.edit.p3811d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.services.IFoundationAVService;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71044aj;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71046al;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.DialogC71048an;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import dmt.p4542av.video.VEEditorAutoStartStopArbiter;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.d.a */
public final class C70985a {

    /* renamed from: a */
    public String f158888a;

    /* renamed from: b */
    public int f158889b;

    /* renamed from: c */
    public String f158890c;

    /* renamed from: d */
    public C71044aj f158891d;

    /* renamed from: e */
    public AbstractC70986a f158892e;

    /* renamed from: f */
    public boolean f158893f;

    /* renamed from: g */
    public int f158894g;

    /* renamed from: h */
    public DialogC71048an f158895h;

    /* renamed from: i */
    public final AbstractC85541q f158896i = new C70987b(this);

    /* renamed from: j */
    public AbstractC31071f f158897j;

    /* renamed from: k */
    public final AbstractC72510a f158898k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.d.a$a */
    public interface AbstractC70986a {
        static {
            Covode.recordClassIndex(83480);
        }

        /* renamed from: a */
        void mo112118a();

        /* renamed from: a */
        void mo112119a(String str, C71044aj ajVar);

        /* renamed from: b */
        void mo112120b();
    }

    static {
        Covode.recordClassIndex(83479);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.d.a$c */
    public static final class C70989c implements VEListener.AbstractC85250s {

        /* renamed from: a */
        final /* synthetic */ C70985a f158901a;

        static {
            Covode.recordClassIndex(83483);
        }

        C70989c(C70985a aVar) {
            this.f158901a = aVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85250s
        /* renamed from: a */
        public final void mo87822a() {
            this.f158901a.mo112117c();
            AbstractC70986a aVar = this.f158901a.f158892e;
            if (aVar != null) {
                aVar.mo112120b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.d.a$e */
    public static final class C70991e implements IFoundationAVService.IFetchResourcesListener {

        /* renamed from: a */
        final /* synthetic */ C70985a f158903a;

        static {
            Covode.recordClassIndex(83485);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.d.a$e$a */
        static final class CallableC70992a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C70991e f158904a;

            static {
                Covode.recordClassIndex(83486);
            }

            CallableC70992a(C70991e eVar) {
                this.f158904a = eVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f158904a.f158903a.f158893f = true;
                this.f158904a.f158903a.f158898k.mo114777B().setValue(true);
                return C89391z.f203057a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C70991e(C70985a aVar) {
            this.f158903a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onFailed(Exception exc) {
            C89219l.m154721d(exc, "");
            AbstractC70986a aVar = this.f158903a.f158892e;
            if (aVar != null) {
                aVar.mo112120b();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onSuccess(String[] strArr) {
            C89219l.m154721d(strArr, "");
            C1731i.m5640b(new CallableC70992a(this), C1731i.f5564c).mo5534a(new C70993b(this), C1731i.f5562a, null);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.d.a$e$b */
        static final class C70993b<TTaskResult, TContinuationResult> implements AbstractC1729g {

            /* renamed from: a */
            final /* synthetic */ C70991e f158905a;

            static {
                Covode.recordClassIndex(83487);
            }

            C70993b(C70991e eVar) {
                this.f158905a = eVar;
            }

            @Override // p077b.AbstractC1729g
            public final /* synthetic */ Object then(C1731i iVar) {
                String str;
                int i;
                int j;
                StickerItemModel stickerItemModel;
                StickerItemModel stickerItemModel2;
                StickerItemModel stickerItemModel3;
                C70985a aVar = this.f158905a.f158903a;
                C71044aj ajVar = aVar.f158891d;
                String str2 = null;
                if (ajVar == null || (stickerItemModel3 = ajVar.f159054c) == null) {
                    str = null;
                } else {
                    str = stickerItemModel3.pinAlgorithmFile;
                }
                if (C84902i.m145892a(str)) {
                    C71044aj ajVar2 = aVar.f158891d;
                    if (!(ajVar2 == null || (stickerItemModel2 = ajVar2.f159054c) == null)) {
                        str2 = stickerItemModel2.pinAlgorithmFile;
                    }
                    C80720e.m139931c(str2);
                }
                aVar.f158890c = C71046al.m125454a();
                C80720e.m139917a(aVar.f158890c, true);
                C71044aj ajVar3 = aVar.f158891d;
                if (!(ajVar3 == null || (stickerItemModel = ajVar3.f159054c) == null)) {
                    stickerItemModel.setPinAlgorithmFile(aVar.f158890c);
                }
                this.f158905a.f158903a.f158894g = this.f158905a.f158903a.f158897j.mo56370k();
                AbstractC31071f fVar = this.f158905a.f158903a.f158897j;
                int i2 = this.f158905a.f158903a.f158889b;
                C71044aj ajVar4 = this.f158905a.f158903a.f158891d;
                if (ajVar4 != null) {
                    i = ajVar4.f159054c.startTime;
                } else {
                    i = 0;
                }
                C71044aj ajVar5 = this.f158905a.f158903a.f158891d;
                if (ajVar5 != null) {
                    j = ajVar5.f159054c.endTime;
                } else {
                    j = this.f158905a.f158903a.f158897j.mo56368j();
                }
                fVar.mo56255a(i2, i, j);
                if (this.f158905a.f158903a.f158897j.mo56372l(this.f158905a.f158903a.f158889b) < 0) {
                    this.f158905a.f158903a.mo112114a();
                }
                return C89391z.f203057a;
            }
        }
    }

    /* renamed from: a */
    public final void mo112114a() {
        this.f158893f = false;
        this.f158897j.mo56375m(this.f158889b);
        this.f158897j.mo56266a(this.f158894g, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek, new C70989c(this));
    }

    /* renamed from: b */
    public final void mo112116b() {
        DialogC71048an anVar;
        DialogC71048an anVar2 = this.f158895h;
        if (anVar2 != null && anVar2.isShowing() && (anVar = this.f158895h) != null) {
            anVar.dismiss();
        }
    }

    /* renamed from: c */
    public final void mo112117c() {
        VEEditorAutoStartStopArbiter value = this.f158898k.mo114779D().getValue();
        if (value != null) {
            C89219l.m154716b(value, "");
            if (value.f200072g) {
                this.f158897j.mo56388t();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.d.a$d */
    static final class C70990d implements VEListener.AbstractC85250s {

        /* renamed from: a */
        final /* synthetic */ C70985a f158902a;

        static {
            Covode.recordClassIndex(83484);
        }

        C70990d(C70985a aVar) {
            this.f158902a = aVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85250s
        /* renamed from: a */
        public final void mo87822a() {
            this.f158902a.mo112117c();
            ByteBuffer[] byteBufferArr = new ByteBuffer[1];
            this.f158902a.f158897j.mo56272a(this.f158902a.f158889b, byteBufferArr);
            C71046al.m125456a(this.f158902a.f158890c, byteBufferArr[0]);
            AbstractC70986a aVar = this.f158902a.f158892e;
            if (aVar != null) {
                aVar.mo112119a(this.f158902a.f158890c, this.f158902a.f158891d);
            }
            this.f158902a.f158897j.mo56349d(this.f158902a.f158896i);
        }
    }

    /* renamed from: a */
    public final void mo112115a(C71044aj ajVar) {
        C89219l.m154721d(ajVar, "");
        AbstractC31071f fVar = this.f158897j;
        StickerItemModel stickerItemModel = ajVar.f159054c;
        C89219l.m154716b(stickerItemModel, "");
        fVar.mo56375m(stickerItemModel.getId());
    }

    public C70985a(AbstractC31071f fVar, Context context, AbstractC72510a aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        this.f158897j = fVar;
        this.f158898k = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.d.a$b */
    static final class C70987b implements AbstractC85541q {

        /* renamed from: a */
        final /* synthetic */ C70985a f158899a;

        static {
            Covode.recordClassIndex(83481);
        }

        C70987b(C70985a aVar) {
            this.f158899a = aVar;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85541q
        public final void onCallback(int i, int i2, float f, String str) {
            if (i != 4098) {
                if (i == 4132) {
                    this.f158899a.mo112114a();
                }
            } else if (this.f158899a.f158893f) {
                C1731i.m5640b(new Callable(this) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.p3811d.C70985a.C70987b.CallableC709881 */

                    /* renamed from: a */
                    final /* synthetic */ C70987b f158900a;

                    static {
                        Covode.recordClassIndex(83482);
                    }

                    {
                        this.f158900a = r1;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        this.f158900a.f158899a.f158893f = false;
                        this.f158900a.f158899a.f158898k.mo114777B().setValue(false);
                        C70985a aVar = this.f158900a.f158899a;
                        aVar.f158897j.mo56266a(0, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek, new C70990d(aVar));
                        return C89391z.f203057a;
                    }
                }, C1731i.f5564c);
            }
        }
    }
}
