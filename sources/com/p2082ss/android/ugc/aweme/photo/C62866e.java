package com.p2082ss.android.ugc.aweme.photo;

import android.content.Intent;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.canvas.C35376e;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65401cn;
import com.p2082ss.android.ugc.aweme.property.C65414cx;
import com.p2082ss.android.ugc.aweme.property.C65494q;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.C69744c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71419h;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.C72724a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4132b.C78859b;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4133c.C78860a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e.C78948b;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import dmt.p4542av.video.SingleImageCoverBitmapData;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.photo.e */
public final class C62866e {

    /* renamed from: a */
    public C62867a f142565a;

    /* renamed from: b */
    public final C62869f f142566b;

    /* renamed from: c */
    private final C62887u f142567c;

    static {
        Covode.recordClassIndex(73697);
    }

    /* renamed from: com.ss.android.ugc.aweme.photo.e$b */
    static final class C62868b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f142570a;

        /* renamed from: b */
        final /* synthetic */ Intent f142571b;

        static {
            Covode.recordClassIndex(73699);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62868b(ActivityC0945e eVar, Intent intent) {
            super(0);
            this.f142570a = eVar;
            this.f142571b = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C72724a.m128203a().mo62204e(this.f142570a, this.f142571b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo100837a() {
        int i;
        int i2;
        AVETParameter j;
        String str;
        ShortVideoContext shortVideoContext = this.f142567c.f142620h;
        boolean z = this.f142566b.f142572a.f142621i;
        if (!(shortVideoContext == null || (j = shortVideoContext.mo110034j()) == null)) {
            j.setShootMode(shortVideoContext.f155763X);
            if (z) {
                str = "shoot";
            } else {
                str = "upload";
            }
            j.setContentSource(str);
            j.setContentType("photo_canvas");
        }
        if (this.f142565a == null) {
            this.f142565a = new C62867a(C35376e.m72403b().getFirst().intValue(), C35376e.m72403b().getSecond().intValue());
        }
        C62887u uVar = this.f142566b.f142572a;
        MusicModel a = C63244g.m114602a().mo73291s().mo101740a(C70005cr.m123611a().f156482a);
        if (a != null && C84902i.m145892a(uVar.f142620h.f155817b.mo109893e())) {
            String e = uVar.f142620h.f155817b.mo109893e();
            if (e == null) {
                e = "";
            }
            C89219l.m154716b(e, "");
            if (uVar.f142620h.f155817b.f155652h == null) {
                uVar.f142620h.mo110005a(C69744c.m123266a());
            }
            uVar.f142620h.f155817b.f155652h.mo110090a(e);
            uVar.f142620h.mo110011a(e);
            uVar.f142620h.f155753N = false;
            int duration = a.getDuration();
            if (duration > 0) {
                uVar.f142620h.f155822g = duration;
            }
            uVar.f142614b = a;
            uVar.f142615c = e;
            uVar.f142616d = true;
            uVar.f142617e = false;
        }
        C62869f fVar = this.f142566b;
        String str2 = fVar.f142573b;
        if (C65401cn.m117101a() && C65414cx.m117133a() != 0 && !C63244g.m114602a().mo73255A().mo93901a() && !AVCommerceServiceImpl.m102988h().mo93962a() && C63238c.f143594u.mo93903b()) {
            new C78860a(new C78859b(null, new WeakReference(this.f142566b.f142572a.f142619g), null, null, C89070n.m154516a(str2), "", 448)).mo122701a(null);
        }
        fVar.f142572a.f142618f = C89070n.m154516a(fVar.f142573b);
        Intent a2 = C62885t.m113287a(fVar.f142572a);
        SingleImageCoverBitmapData singleImageCoverBitmapData = fVar.f142576e;
        if (singleImageCoverBitmapData != null) {
            Objects.requireNonNull(singleImageCoverBitmapData, "null cannot be cast to non-null type android.os.Parcelable");
            a2.putExtra("key_choose_media_item_cover_bitmap_data", (Parcelable) singleImageCoverBitmapData);
        }
        if (fVar.f142578g) {
            a2.putExtra("origin", 0);
        }
        C65494q a3 = C35376e.m72402a();
        if (fVar.f142572a.f142620h.f155820e != null) {
            i = Math.max(Math.min(fVar.f142572a.f142620h.f155822g, a3.f147711c), a3.f147710b);
        } else if (fVar.f142572a.f142614b != null) {
            MusicModel musicModel = fVar.f142572a.f142614b;
            if (musicModel != null) {
                i2 = musicModel.getDuration();
            } else {
                i2 = 10000;
            }
            i = Math.max(Math.min(i2, a3.f147711c), a3.f147710b);
        } else {
            i = a3.f147709a;
        }
        C62867a aVar = this.f142565a;
        if (aVar == null) {
            C89219l.m154710a("imageSize");
        }
        int i3 = aVar.f142568a;
        C62867a aVar2 = this.f142565a;
        if (aVar2 == null) {
            C89219l.m154710a("imageSize");
        }
        VideoFileInfo videoFileInfo = new VideoFileInfo(i3, aVar2.f142569b, (long) i, 30, 0, 0, 0, 0, 240, null);
        String str3 = C78948b.m137762a("contact_video") + File.separator + C78948b.m137769c(".mp4");
        C62867a aVar3 = this.f142565a;
        if (aVar3 == null) {
            C89219l.m154710a("imageSize");
        }
        int i4 = aVar3.f142568a;
        C62867a aVar4 = this.f142565a;
        if (aVar4 == null) {
            C89219l.m154710a("imageSize");
        }
        a2.putExtra("extra_edit_preview_info", (Parcelable) new C71419h(i4, aVar4.f142569b, null, 28).mo113031a(new EditVideoSegment(str3, null, videoFileInfo)));
        MediaModel mediaModel = fVar.f142575d;
        if (mediaModel != null) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            arrayList.add(new ImportVideoInfo(mediaModel.f134672l, mediaModel.f134673m, 0, 0, "0", mediaModel.f134668h, mediaModel.f134668h, null, null, 0, 0.0f, mediaModel.f134662b, 1932, null));
            a2.putParcelableArrayListExtra("extra_import_video_info_list", arrayList);
        }
        a2.putExtra("photo_canvas_data", fVar.f142577f);
        ActivityC0945e eVar = fVar.f142572a.f142619g;
        C62868b bVar = new C62868b(eVar, a2);
        if (eVar instanceof AbstractC1204m) {
            ActivityC0945e eVar2 = eVar;
            AbstractC1196i lifecycle = eVar2.getLifecycle();
            C89219l.m154716b(lifecycle, "");
            if (lifecycle.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.RESUMED)) {
                bVar.invoke();
            } else {
                eVar2.getLifecycle().mo4012a(new PhotoCanvasEnterEditNextImpl$startActivitySafely$1(eVar, bVar));
            }
        } else {
            bVar.invoke();
        }
        AbstractC89172b<Boolean, C89391z> bVar2 = fVar.f142579h;
        if (bVar2 != null) {
            bVar2.invoke(true);
        }
    }

    public C62866e(C62869f fVar) {
        C89219l.m154721d(fVar, "");
        this.f142566b = fVar;
        this.f142567c = fVar.f142572a;
    }

    /* renamed from: com.ss.android.ugc.aweme.photo.e$a */
    static final class C62867a {

        /* renamed from: a */
        public final int f142568a;

        /* renamed from: b */
        public final int f142569b;

        static {
            Covode.recordClassIndex(73698);
        }

        public C62867a(int i, int i2) {
            this.f142568a = i;
            this.f142569b = i2;
        }
    }
}
