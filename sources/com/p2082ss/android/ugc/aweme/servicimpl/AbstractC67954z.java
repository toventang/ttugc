package com.p2082ss.android.ugc.aweme.servicimpl;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.z */
public abstract class AbstractC67954z<RETURN_VALUE> {
    static {
        Covode.recordClassIndex(80123);
    }

    private AbstractC67954z() {
    }

    public /* synthetic */ AbstractC67954z(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.z$a */
    public static final class C67955a extends AbstractC67954z<C89391z> {

        /* renamed from: a */
        public final ActivityC0945e f152234a;

        /* renamed from: b */
        public final String f152235b;

        /* renamed from: c */
        public final List<String> f152236c;

        /* renamed from: d */
        public final ShortVideoContext f152237d;

        /* renamed from: e */
        public final FaceStickerBean f152238e;

        /* renamed from: f */
        public final boolean f152239f;

        /* renamed from: g */
        public final ExtractFramesModel f152240g;

        /* renamed from: h */
        public final MediaModel f152241h;

        /* renamed from: i */
        public final AbstractC89172b<Boolean, C89391z> f152242i;

        static {
            Covode.recordClassIndex(80124);
        }

        public /* synthetic */ C67955a(ActivityC0945e eVar, String str, List list, ShortVideoContext shortVideoContext, FaceStickerBean faceStickerBean, ExtractFramesModel extractFramesModel, AbstractC89172b bVar) {
            this(eVar, str, list, shortVideoContext, faceStickerBean, false, extractFramesModel, null, bVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67955a(ActivityC0945e eVar, String str, List<String> list, ShortVideoContext shortVideoContext, FaceStickerBean faceStickerBean, boolean z, ExtractFramesModel extractFramesModel, MediaModel mediaModel, AbstractC89172b<? super Boolean, C89391z> bVar) {
            super((byte) 0);
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(shortVideoContext, "");
            C89219l.m154721d(bVar, "");
            this.f152234a = eVar;
            this.f152235b = str;
            this.f152236c = list;
            this.f152237d = shortVideoContext;
            this.f152238e = faceStickerBean;
            this.f152239f = z;
            this.f152240g = extractFramesModel;
            this.f152241h = mediaModel;
            this.f152242i = bVar;
        }
    }
}
