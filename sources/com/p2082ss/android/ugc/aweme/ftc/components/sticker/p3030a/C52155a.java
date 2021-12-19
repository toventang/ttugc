package com.p2082ss.android.ugc.aweme.ftc.components.sticker.p3030a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.C52154a;
import com.p2082ss.android.ugc.aweme.services.IFoundationAVService;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71046al;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.DialogC71047am;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.a.a */
public final class C52155a {

    /* renamed from: a */
    public String f120164a;

    /* renamed from: b */
    public int f120165b;

    /* renamed from: c */
    public String f120166c;

    /* renamed from: d */
    public C52154a f120167d;

    /* renamed from: e */
    public AbstractC52156a f120168e;

    /* renamed from: f */
    public boolean f120169f;

    /* renamed from: g */
    public int f120170g;

    /* renamed from: h */
    public DialogC71047am f120171h;

    /* renamed from: i */
    public final AbstractC85541q f120172i = new C52157b(this);

    /* renamed from: j */
    public AbstractC31071f f120173j;

    /* renamed from: k */
    public final AbstractC72510a f120174k;

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.a.a$a */
    public interface AbstractC52156a {
        static {
            Covode.recordClassIndex(61537);
        }

        /* renamed from: a */
        void mo87883a();

        /* renamed from: a */
        void mo87884a(String str, C52154a aVar);

        /* renamed from: b */
        void mo87885b();
    }

    static {
        Covode.recordClassIndex(61536);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.a.a$e */
    public static final class C52161e implements IFoundationAVService.IFetchResourcesListener {

        /* renamed from: a */
        final /* synthetic */ C52155a f120179a;

        static {
            Covode.recordClassIndex(61542);
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.a.a$e$a */
        static final class CallableC52162a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C52161e f120180a;

            static {
                Covode.recordClassIndex(61543);
            }

            CallableC52162a(C52161e eVar) {
                this.f120180a = eVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f120180a.f120179a.f120169f = true;
                this.f120180a.f120179a.f120174k.mo114777B().setValue(true);
                return C89391z.f203057a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C52161e(C52155a aVar) {
            this.f120179a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onFailed(Exception exc) {
            C89219l.m154721d(exc, "");
            AbstractC52156a aVar = this.f120179a.f120168e;
            if (aVar != null) {
                aVar.mo87885b();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onSuccess(String[] strArr) {
            C89219l.m154721d(strArr, "");
            C1731i.m5640b(new CallableC52162a(this), C1731i.f5564c).mo5534a(new C52163b(this), C1731i.f5562a, null);
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.a.a$e$b */
        static final class C52163b<TTaskResult, TContinuationResult> implements AbstractC1729g {

            /* renamed from: a */
            final /* synthetic */ C52161e f120181a;

            static {
                Covode.recordClassIndex(61544);
            }

            C52163b(C52161e eVar) {
                this.f120181a = eVar;
            }

            @Override // p077b.AbstractC1729g
            public final /* synthetic */ Object then(C1731i iVar) {
                String str;
                int i;
                int j;
                StickerItemModel stickerItemModel;
                StickerItemModel stickerItemModel2;
                StickerItemModel stickerItemModel3;
                C52155a aVar = this.f120181a.f120179a;
                C52154a aVar2 = aVar.f120167d;
                String str2 = null;
                if (aVar2 == null || (stickerItemModel3 = aVar2.f120151b) == null) {
                    str = null;
                } else {
                    str = stickerItemModel3.pinAlgorithmFile;
                }
                if (C84902i.m145892a(str)) {
                    C52154a aVar3 = aVar.f120167d;
                    if (!(aVar3 == null || (stickerItemModel2 = aVar3.f120151b) == null)) {
                        str2 = stickerItemModel2.pinAlgorithmFile;
                    }
                    C80720e.m139931c(str2);
                }
                aVar.f120166c = C71046al.m125454a();
                C80720e.m139917a(aVar.f120166c, true);
                C52154a aVar4 = aVar.f120167d;
                if (!(aVar4 == null || (stickerItemModel = aVar4.f120151b) == null)) {
                    stickerItemModel.setPinAlgorithmFile(aVar.f120166c);
                }
                this.f120181a.f120179a.f120170g = this.f120181a.f120179a.f120173j.mo56370k();
                AbstractC31071f fVar = this.f120181a.f120179a.f120173j;
                int i2 = this.f120181a.f120179a.f120165b;
                C52154a aVar5 = this.f120181a.f120179a.f120167d;
                if (aVar5 != null) {
                    i = aVar5.f120151b.startTime;
                } else {
                    i = 0;
                }
                C52154a aVar6 = this.f120181a.f120179a.f120167d;
                if (aVar6 != null) {
                    j = aVar6.f120151b.endTime;
                } else {
                    j = this.f120181a.f120179a.f120173j.mo56368j();
                }
                fVar.mo56255a(i2, i, j);
                this.f120181a.f120179a.f120173j.mo56372l(this.f120181a.f120179a.f120165b);
                return C89391z.f203057a;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.a.a$c */
    static final class C52159c implements VEListener.AbstractC85250s {

        /* renamed from: a */
        final /* synthetic */ C52155a f120177a;

        static {
            Covode.recordClassIndex(61540);
        }

        C52159c(C52155a aVar) {
            this.f120177a = aVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85250s
        /* renamed from: a */
        public final void mo87822a() {
            this.f120177a.f120173j.mo56388t();
            AbstractC52156a aVar = this.f120177a.f120168e;
            if (aVar != null) {
                aVar.mo87885b();
            }
        }
    }

    /* renamed from: a */
    public final void mo87882a() {
        DialogC71047am amVar;
        DialogC71047am amVar2 = this.f120171h;
        if (amVar2 != null && amVar2.isShowing() && (amVar = this.f120171h) != null) {
            amVar.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.a.a$d */
    static final class C52160d implements VEListener.AbstractC85250s {

        /* renamed from: a */
        final /* synthetic */ C52155a f120178a;

        static {
            Covode.recordClassIndex(61541);
        }

        C52160d(C52155a aVar) {
            this.f120178a = aVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85250s
        /* renamed from: a */
        public final void mo87822a() {
            this.f120178a.f120173j.mo56388t();
            ByteBuffer[] byteBufferArr = new ByteBuffer[1];
            this.f120178a.f120173j.mo56272a(this.f120178a.f120165b, byteBufferArr);
            C71046al.m125456a(this.f120178a.f120166c, byteBufferArr[0]);
            AbstractC52156a aVar = this.f120178a.f120168e;
            if (aVar != null) {
                aVar.mo87884a(this.f120178a.f120166c, this.f120178a.f120167d);
            }
            this.f120178a.f120173j.mo56349d(this.f120178a.f120172i);
        }
    }

    public C52155a(AbstractC31071f fVar, Context context, AbstractC72510a aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        this.f120173j = fVar;
        this.f120174k = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.a.a$b */
    static final class C52157b implements AbstractC85541q {

        /* renamed from: a */
        final /* synthetic */ C52155a f120175a;

        static {
            Covode.recordClassIndex(61538);
        }

        C52157b(C52155a aVar) {
            this.f120175a = aVar;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85541q
        public final void onCallback(int i, int i2, float f, String str) {
            if (i != 4098) {
                if (i == 4132) {
                    this.f120175a.f120169f = false;
                    C52155a aVar = this.f120175a;
                    aVar.f120173j.mo56375m(aVar.f120165b);
                    aVar.f120173j.mo56266a(aVar.f120170g, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek, new C52159c(aVar));
                }
            } else if (this.f120175a.f120169f) {
                C1731i.m5640b(new Callable(this) {
                    /* class com.p2082ss.android.ugc.aweme.ftc.components.sticker.p3030a.C52155a.C52157b.CallableC521581 */

                    /* renamed from: a */
                    final /* synthetic */ C52157b f120176a;

                    static {
                        Covode.recordClassIndex(61539);
                    }

                    {
                        this.f120176a = r1;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        this.f120176a.f120175a.f120169f = false;
                        this.f120176a.f120175a.f120174k.mo114777B().setValue(false);
                        C52155a aVar = this.f120176a.f120175a;
                        aVar.f120173j.mo56266a(0, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek, new C52160d(aVar));
                        return C89391z.f203057a;
                    }
                }, C1731i.f5564c);
            }
        }
    }
}
