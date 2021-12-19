package com.p2082ss.android.ugc.aweme.tools.extract.p4116a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.tools.extract.C78506aa;
import com.p2082ss.android.ugc.aweme.tools.extract.C78507ab;
import com.p2082ss.android.ugc.aweme.tools.extract.C78595z;
import com.p2082ss.android.ugc.aweme.utils.C80295cd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.a.i */
public final class C78503i {

    /* renamed from: a */
    public static final C78503i f176406a = new C78503i();

    private C78503i() {
    }

    static {
        Covode.recordClassIndex(91635);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.a.i$a */
    public static final class C78504a {

        /* renamed from: a */
        public final int f176407a;

        /* renamed from: b */
        public final int f176408b;

        /* renamed from: c */
        public final String f176409c;

        static {
            Covode.recordClassIndex(91636);
        }

        /* renamed from: a */
        public static C78504a m137067a(int i, int i2, String str) {
            C89219l.m154721d(str, "");
            return new C78504a(i, i2, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C78504a)) {
                return false;
            }
            C78504a aVar = (C78504a) obj;
            return this.f176407a == aVar.f176407a && this.f176408b == aVar.f176408b && C89219l.m154714a(this.f176409c, aVar.f176409c);
        }

        public final int hashCode() {
            int i = ((this.f176407a * 31) + this.f176408b) * 31;
            String str = this.f176409c;
            return i + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "ResultData(code=" + this.f176407a + ", frameCount=" + this.f176408b + ", msg=" + this.f176409c + ")";
        }

        public /* synthetic */ C78504a(int i) {
            this(-2, i, "");
        }

        private C78504a(int i, int i2, String str) {
            C89219l.m154721d(str, "");
            this.f176407a = i;
            this.f176408b = i2;
            this.f176409c = str;
        }
    }

    /* renamed from: a */
    public static C89378p<Integer, String> m137065a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        ArrayList<AbstractC78498e> arrayList = new ArrayList();
        arrayList.add(new C78501g());
        arrayList.add(new C78496c());
        for (AbstractC78498e eVar : arrayList) {
            C89378p<Integer, String> a = eVar.mo122413a(videoPublishEditModel, 0);
            if (a.getFirst().intValue() != -2) {
                return a;
            }
        }
        return C89387v.m154943a(-1, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m137066b(com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11) {
        /*
        // Method dump skipped, instructions count: 321
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.extract.p4116a.C78503i.m137066b(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):int");
    }

    /* renamed from: a */
    public static C78504a m137064a(VideoPublishEditModel videoPublishEditModel, int i) {
        int i2;
        int i3;
        List<C78595z> uploadFrameInfoList;
        new C78504a(i);
        if (videoPublishEditModel.hasImageStickers()) {
            int size = C78489b.m137050a(videoPublishEditModel.extractFramesModel.getExtractFramesDir()).size();
            if (size == 0) {
                return C78504a.m137067a(10, size, "custom sticker count == 0");
            }
            i2 = size + 0;
        } else {
            i2 = 0;
        }
        C80295cd.m139202a(videoPublishEditModel);
        boolean z = true;
        if (videoPublishEditModel.containBackgroundVideo) {
            ArrayList<C78595z> a = C78506aa.m137068a(videoPublishEditModel);
            if (a != null && !a.isEmpty()) {
                z = false;
            }
            if (z) {
                return C78504a.m137067a(11, 0, "segments size == 0");
            }
            Iterator<T> it = a.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                i4 += (int) (it.next().f176634c / 500);
            }
            if (i4 == 0) {
                return C78504a.m137067a(11, 0, "bg video count == 0");
            }
            i2 += i4;
        } else if (C80295cd.m139202a(videoPublishEditModel)) {
            C78505j jVar = C78507ab.f176423a;
            if (jVar == null || (uploadFrameInfoList = jVar.getUploadFrameInfoList()) == null || uploadFrameInfoList.isEmpty()) {
                i3 = 0;
            } else {
                Iterator<T> it2 = jVar.getUploadFrameInfoList().iterator();
                i3 = 0;
                while (it2.hasNext()) {
                    i3 += it2.next().f176636e;
                }
            }
            Iterator<T> it3 = videoPublishEditModel.extractFramesModel.getAllFrames().iterator();
            int i5 = 0;
            while (it3.hasNext()) {
                if (C89361p.m154908a((CharSequence) it3.next().getPath(), (CharSequence) "upload_sticker_frame", false)) {
                    i5++;
                }
            }
            if (i5 != i3) {
                return C78504a.m137067a(17, 0, "upload sticker count:" + i5 + ", size:" + i3);
            }
            i2 += i5;
        }
        return C78504a.m137067a(-2, i - i2, "");
    }
}
