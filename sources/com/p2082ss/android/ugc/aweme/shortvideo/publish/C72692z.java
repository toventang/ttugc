package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.photo.C62854a;
import com.p2082ss.android.ugc.aweme.photo.p3547b.C62858a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72608ai;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72867e;
import com.p2082ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.p2082ss.android.ugc.tools.utils.C84891c;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.z */
public final class C72692z {

    /* renamed from: c */
    public static final C72693a f162967c = new C72693a((byte) 0);

    /* renamed from: a */
    final AbstractC89244h f162968a = C89250i.m154773a((AbstractC89171a) new C72696d(this));

    /* renamed from: b */
    public final Context f162969b;

    /* renamed from: d */
    private final C72608ai f162970d;

    /* renamed from: e */
    private volatile boolean f162971e;

    /* renamed from: f */
    private final AbstractC89244h f162972f = C89250i.m154773a((AbstractC89171a) new C72695c(this));

    /* renamed from: g */
    private String f162973g;

    /* renamed from: h */
    private final AbstractC72628f f162974h;

    static {
        Covode.recordClassIndex(85375);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.z$a */
    public static final class C72693a {
        static {
            Covode.recordClassIndex(85376);
        }

        private C72693a() {
        }

        public /* synthetic */ C72693a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.z$d */
    static final class C72696d extends AbstractC89220m implements AbstractC89171a<C62854a> {

        /* renamed from: a */
        final /* synthetic */ C72692z f162979a;

        static {
            Covode.recordClassIndex(85379);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72696d(C72692z zVar) {
            super(0);
            this.f162979a = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C62854a invoke() {
            return new C62854a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.z$e */
    public static final class CallableC72697e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C72692z f162980a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f162981b;

        /* renamed from: c */
        final /* synthetic */ AtomicInteger f162982c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f162983d;

        static {
            Covode.recordClassIndex(85380);
        }

        CallableC72697e(C72692z zVar, ArrayList arrayList, AtomicInteger atomicInteger, ArrayList arrayList2) {
            this.f162980a = zVar;
            this.f162981b = arrayList;
            this.f162982c = atomicInteger;
            this.f162983d = arrayList2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f162980a.mo114968a(this.f162981b, this.f162982c, this.f162983d);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.z$c */
    static final class C72695c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C72692z f162978a;

        static {
            Covode.recordClassIndex(85378);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72695c(C72692z zVar) {
            super(0);
            this.f162978a = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String a;
            Resources resources = this.f162978a.f162969b.getResources();
            Object[] objArr = new Object[1];
            AbstractC32846a e = C63238c.f143594u.mo93906e();
            if (e == null) {
                a = "illegal usr state";
            } else {
                a = e.mo58658a();
                if (TextUtils.isEmpty(a)) {
                    a = e.mo58659b();
                    C89219l.m154716b(a, "");
                } else {
                    C89219l.m154716b(a, "");
                }
            }
            objArr[0] = a;
            String string = resources.getString(R.string.bl7, objArr);
            C89219l.m154716b(string, "");
            return string;
        }
    }

    /* renamed from: a */
    public final void mo114967a(List<C72694b> list) {
        if (!list.isEmpty()) {
            C72867e.m128688b(this.f162973g);
        }
        this.f162974h.mo114894a(list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.z$g */
    public static final class C72699g extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72692z f162987a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f162988b;

        /* renamed from: c */
        final /* synthetic */ C72694b f162989c;

        /* renamed from: d */
        final /* synthetic */ AtomicInteger f162990d;

        /* renamed from: e */
        final /* synthetic */ List f162991e;

        static {
            Covode.recordClassIndex(85382);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72699g(C72692z zVar, ArrayList arrayList, C72694b bVar, AtomicInteger atomicInteger, List list) {
            super(1);
            this.f162987a = zVar;
            this.f162988b = arrayList;
            this.f162989c = bVar;
            this.f162990d = atomicInteger;
            this.f162991e = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.f162988b.add(this.f162989c);
                this.f162990d.incrementAndGet();
                this.f162987a.mo114968a(this.f162991e, this.f162990d, this.f162988b);
            } else {
                this.f162987a.mo114967a(this.f162988b);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.z$f */
    public static final class C72698f extends AbstractC89220m implements AbstractC89172b<Bitmap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72692z f162984a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f162985b;

        /* renamed from: c */
        final /* synthetic */ C72694b f162986c;

        static {
            Covode.recordClassIndex(85381);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72698f(C72692z zVar, AbstractC89172b bVar, C72694b bVar2) {
            super(1);
            this.f162984a = zVar;
            this.f162985b = bVar;
            this.f162986c = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            if (bitmap2 == null) {
                this.f162985b.invoke(false);
            } else {
                File file = new File(this.f162986c.f162975a);
                StringBuilder sb = new StringBuilder();
                File parentFile = file.getParentFile();
                C89219l.m154716b(parentFile, "");
                File file2 = new File(((C62854a) this.f162984a.f162968a.getValue()).f142544a + File.separator + sb.append(parentFile.getName()).append("_").append(file.getName()).toString());
                boolean a = C84891c.m145848a(bitmap2, file2, 100, Bitmap.CompressFormat.PNG);
                C84891c.m145846a(bitmap2);
                if (a) {
                    file2.getPath();
                    C62858a.m113275a(this.f162984a.f162969b, file2.getPath());
                }
                this.f162985b.invoke(Boolean.valueOf(a));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo114966a(C43223c cVar) {
        ArrayList<TimeSpeedModelExtension> a;
        String stickerToast;
        if (cVar != null && cVar.f100924x == 0) {
            if (TextUtils.isEmpty(cVar.f100888K)) {
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = cVar.f100900W.f100817ax;
                if (C13617h.m24465a(multiEditVideoStatusRecordData != null ? multiEditVideoStatusRecordData.editCutSegments : null)) {
                    return;
                }
            }
            if (C63238c.f143566D.mo73307c().mo101757a(this.f162969b) == 0) {
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = cVar.f100900W.f100817ax;
                if (C13617h.m24466b(multiEditVideoStatusRecordData2 != null ? multiEditVideoStatusRecordData2.editCutSegments : null)) {
                    a = cVar.f100900W.f100817ax.editCutSegments;
                } else {
                    a = CameraComponentModel.m123137a(cVar.f100888K);
                }
                this.f162973g = cVar.mo73676f();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (a != null) {
                    for (T t : a) {
                        SavePhotoStickerInfo savePhotoStickerInfo = t.getSavePhotoStickerInfo();
                        List<String> capturedPhotoPaths = savePhotoStickerInfo != null ? savePhotoStickerInfo.getCapturedPhotoPaths() : null;
                        if (!C84904k.m145909a(capturedPhotoPaths)) {
                            String stickerId = t.getStickerId();
                            String str = "";
                            C89219l.m154716b(stickerId, str);
                            String c = C72867e.m128689c(stickerId);
                            SavePhotoStickerInfo savePhotoStickerInfo2 = t.getSavePhotoStickerInfo();
                            if (!(savePhotoStickerInfo2 == null || (stickerToast = savePhotoStickerInfo2.getStickerToast()) == null)) {
                                str = stickerToast;
                            }
                            if (capturedPhotoPaths != null) {
                                for (T t2 : capturedPhotoPaths) {
                                    if (new File((String) t2).exists()) {
                                        arrayList2.add(new C72694b(t2, c, str));
                                    }
                                }
                            }
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    C1731i.m5640b(new CallableC72697e(this, arrayList2, new AtomicInteger(0), arrayList), C1731i.f5562a);
                }
            }
        }
    }

    public C72692z(Context context, AbstractC72628f fVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(fVar, "");
        this.f162969b = context;
        this.f162974h = fVar;
        this.f162970d = new C72608ai(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.z$b */
    public static final class C72694b {

        /* renamed from: a */
        public final String f162975a;

        /* renamed from: b */
        public final String f162976b;

        /* renamed from: c */
        public final String f162977c;

        static {
            Covode.recordClassIndex(85377);
        }

        public C72694b(String str, String str2, String str3) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str3, "");
            this.f162975a = str;
            this.f162976b = str2;
            this.f162977c = str3;
        }
    }

    /* renamed from: a */
    public final void mo114968a(List<C72694b> list, AtomicInteger atomicInteger, ArrayList<C72694b> arrayList) {
        if (!this.f162971e) {
            int i = atomicInteger.get();
            if (i >= list.size()) {
                mo114967a(arrayList);
                return;
            }
            C72694b bVar = list.get(i);
            C72699g gVar = new C72699g(this, arrayList, bVar, atomicInteger, list);
            C72608ai aiVar = this.f162970d;
            String str = bVar.f162975a;
            String str2 = bVar.f162976b;
            String str3 = (String) this.f162972f.getValue();
            C72698f fVar = new C72698f(this, gVar, bVar);
            C89219l.m154721d(str, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(fVar, "");
            C72608ai.m128085a(str, new C72608ai.C72610b(aiVar, fVar, str3, str2));
        }
    }
}
