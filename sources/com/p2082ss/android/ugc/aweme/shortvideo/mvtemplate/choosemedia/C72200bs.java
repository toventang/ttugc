package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3846b.C72308f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3790ac.C69791b;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.vesdk.VEUtils;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bs */
public final class C72200bs {

    /* renamed from: a */
    public static final C72200bs f161863a = new C72200bs();

    private C72200bs() {
    }

    static {
        Covode.recordClassIndex(84865);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bs$a */
    public static final class CallableC72201a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ List f161864a;

        static {
            Covode.recordClassIndex(84866);
        }

        CallableC72201a(List list) {
            this.f161864a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            for (MediaModel mediaModel : this.f161864a) {
                if (mediaModel.f134667g == 4) {
                    return VEUtils.getVideoFileInfo(mediaModel.f134662b);
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static void m127400a(List<? extends MediaModel> list) {
        String str;
        C89219l.m154721d(list, "");
        if (C63244g.m114602a().mo73255A().mo93901a()) {
            C84425b a = new C84425b().mo129406a("content_type", "video");
            if (list.size() > 1) {
                str = "multiple_content";
            } else {
                str = "single_content";
            }
            C39162r.m79460a("upload_content_next", a.mo129406a("upload_type", str).f188764a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bs$b */
    public static final class C72202b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ ShortVideoContext f161865a;

        /* renamed from: b */
        final /* synthetic */ List f161866b;

        /* renamed from: c */
        final /* synthetic */ int f161867c;

        /* renamed from: d */
        final /* synthetic */ int f161868d;

        static {
            Covode.recordClassIndex(84867);
        }

        C72202b(ShortVideoContext shortVideoContext, List list, int i, int i2) {
            this.f161865a = shortVideoContext;
            this.f161866b = list;
            this.f161867c = i;
            this.f161868d = i2;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<VEUtils.VEVideoFileInfo> iVar) {
            String str;
            boolean z;
            String str2;
            String str3;
            int i;
            int i2;
            ShortVideoContext shortVideoContext = this.f161865a;
            List<MediaModel> list = this.f161866b;
            int i3 = this.f161867c;
            int i4 = this.f161868d;
            VEUtils.VEVideoFileInfo d = iVar != null ? iVar.mo5545d() : null;
            if (list != null) {
                for (MediaModel mediaModel : list) {
                    if (mediaModel.mo96674b()) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            mediaModel = null;
            if (list == null) {
                C89219l.m154715b();
            }
            if (list.size() > 1) {
                str = "multiple_content";
            } else {
                str = "single_content";
            }
            int size = list.size() - i3;
            String a = C69791b.m123314a(i3, list.size() - i3);
            if (list.size() > 1) {
                z = true;
            } else {
                z = false;
            }
            C72308f a2 = new C72308f(shortVideoContext, "video", str, i3, size, a, z).mo114578b(0).mo114575a(i4);
            Integer valueOf = d != null ? Integer.valueOf(d.fps) : null;
            C84425b bVar = a2.f162107a;
            if (valueOf == null || (str2 = String.valueOf(valueOf.intValue())) == null) {
                str2 = "";
            }
            bVar.mo129406a("fps", str2);
            Integer valueOf2 = d != null ? Integer.valueOf(d.bitrate) : null;
            C84425b bVar2 = a2.f162107a;
            if (valueOf2 == null || (str3 = String.valueOf(valueOf2.intValue())) == null) {
                str3 = "";
            }
            bVar2.mo129406a("file_bitrate", str3);
            if (mediaModel != null) {
                i = mediaModel.f134672l;
                i2 = mediaModel.f134673m;
            } else {
                i = 0;
                i2 = 0;
            }
            String sb = new StringBuilder().append(Math.max(0, i)).append('*').append(Math.max(0, i2)).toString();
            C89219l.m154721d(sb, "");
            a2.f162107a.mo129406a("resolution", sb);
            a2.mo114576a(shortVideoContext).mo114577a();
            return null;
        }
    }

    /* renamed from: a */
    public static final void m127398a(int i, int i2) {
        if (i == -6) {
            i = 2;
        } else if (i == -5) {
            i = 0;
        } else if (i == -2) {
            i = 3;
        } else if (i == -1) {
            i = 1;
        }
        C80322d.m139251a("tool_performance_asset_unavailable", new C84425b().mo129403a(StringSet.type, i2).mo129403a("code", i).f188764a);
    }

    /* renamed from: a */
    public static void m127399a(ShortVideoContext shortVideoContext, List<? extends MediaModel> list, int i, int i2) {
        if (list != null && !list.isEmpty()) {
            C1731i.m5640b(new CallableC72201a(list), C1731i.f5562a).mo5534a(new C72202b(shortVideoContext, list, i, i2), C1731i.f5564c, null);
        }
    }
}
