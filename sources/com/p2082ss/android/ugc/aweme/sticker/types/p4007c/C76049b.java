package com.p2082ss.android.ugc.aweme.sticker.types.p4007c;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.ttve.model.VEFrame;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.aweme.photo.C62859c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70650dt;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72867e;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75627g;
import com.p2082ss.android.ugc.aweme.sticker.types.p4007c.C76052c;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.utils.C84891c;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.c.b */
public final class C76049b implements AbstractC75627g {

    /* renamed from: b */
    public static final C76050a f170874b = new C76050a((byte) 0);

    /* renamed from: a */
    public final AbstractC31193a f170875a;

    /* renamed from: c */
    private final AbstractC14177d f170876c;

    /* renamed from: d */
    private final ShortVideoContext f170877d;

    /* renamed from: e */
    private final AbstractC27255q<List<String>> f170878e;

    static {
        Covode.recordClassIndex(88993);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.c.b$a */
    public static final class C76050a {
        static {
            Covode.recordClassIndex(88994);
        }

        private C76050a() {
        }

        public /* synthetic */ C76050a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.c.b$b */
    static final class CallableC76051b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C76049b f170879a;

        /* renamed from: b */
        final /* synthetic */ String f170880b;

        /* renamed from: c */
        final /* synthetic */ String f170881c;

        static {
            Covode.recordClassIndex(88995);
        }

        CallableC76051b(C76049b bVar, String str, String str2) {
            this.f170879a = bVar;
            this.f170880b = str;
            this.f170881c = str2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Bitmap bitmap;
            VEFrame e = this.f170879a.f170875a.mo56813e(this.f170880b);
            if (e != null) {
                bitmap = e.toBitmap();
            } else {
                bitmap = null;
            }
            return Boolean.valueOf(C84891c.m145848a(bitmap, new File(this.f170881c), 100, Bitmap.CompressFormat.PNG));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75627g
    /* renamed from: b */
    public final void mo119360b(String str) {
        this.f170876c.mo22808b(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75627g
    /* renamed from: a */
    public final void mo119359a(String str) {
        String str2;
        if (!TextUtils.isEmpty(str) && C84902i.m145894b(new File(C72867e.m128686a(this.f170877d.f155830o))) < 10) {
            String a = C72867e.m128686a(this.f170877d.f155830o);
            C70650dt d = this.f170877d.f155817b.mo109891d();
            if (d != null) {
                str2 = d.segmentBeginTime;
            } else {
                str2 = null;
            }
            String a2 = new C62859c(a, str2, str).mo100820a();
            AbstractC14177d dVar = this.f170876c;
            File parentFile = new File(a2).getParentFile();
            C89219l.m154716b(parentFile, "");
            dVar.mo22787a(parentFile.getPath(), a2);
            C1731i.m5640b(new CallableC76051b(this, str, a2), C1731i.f5562a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75627g
    /* renamed from: a */
    public final void mo119358a(Effect effect, Context context) {
        String a;
        C89219l.m154721d(context, "");
        if (effect != null) {
            List<String> b = this.f170878e.mo5560b();
            C89219l.m154716b(b, "");
            List<String> list = b;
            C89219l.m154721d(context, "");
            C89219l.m154721d(effect, "");
            C89219l.m154721d(list, "");
            if (!list.isEmpty()) {
                String c = C72867e.m128689c(effect.getEffectId());
                if (!new File(c).exists() && (a = C76052c.m133341a(effect)) != null && a.length() != 0) {
                    Downloader.with(context).url(list.get(0) + a).ignoreDataVerify(true).savePath(C72867e.m128685a()).name(new File(c).getName()).subThreadListener(new C76052c.C76053a(a)).download();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("url prefix cannot be empty");
        }
    }

    public C76049b(AbstractC31193a aVar, AbstractC14177d dVar, ShortVideoContext shortVideoContext, AbstractC27255q<List<String>> qVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(qVar, "");
        this.f170875a = aVar;
        this.f170876c = dVar;
        this.f170877d = shortVideoContext;
        this.f170878e = qVar;
    }
}
