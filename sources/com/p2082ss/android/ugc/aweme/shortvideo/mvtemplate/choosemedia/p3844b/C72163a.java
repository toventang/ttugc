package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.a */
public final class C72163a implements AbstractC72165c {
    static {
        Covode.recordClassIndex(84828);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b.AbstractC72165c
    /* renamed from: a */
    public final void mo114418a(ShortVideoContext shortVideoContext, boolean z) {
        String str;
        String str2;
        C84425b bVar = new C84425b();
        String str3 = "";
        if (shortVideoContext == null || (str = shortVideoContext.f155830o) == null) {
            str = str3;
        }
        C84425b a = bVar.mo129406a("creation_id", str);
        if (!(shortVideoContext == null || (str2 = shortVideoContext.f155831p) == null)) {
            str3 = str2;
        }
        C39162r.m79460a("album_scroll", a.mo129406a("shoot_way", str3).mo129406a("enter_method", z ? "click" : "slide").f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b.AbstractC72165c
    /* renamed from: a */
    public final void mo114411a() {
        C39162r.m79460a("select_photo_album", new C84425b().mo129406a("content_source", "upload").mo129406a("content_type", "mv").mo129406a("upload_type", "multiple_content").f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b.AbstractC72165c
    /* renamed from: b */
    public final void mo114419b(ShortVideoContext shortVideoContext, boolean z) {
        String str;
        String str2;
        String str3;
        C84425b bVar = new C84425b();
        String str4 = "";
        if (shortVideoContext == null || (str = shortVideoContext.f155830o) == null) {
            str = str4;
        }
        C84425b a = bVar.mo129406a("creation_id", str);
        if (!(shortVideoContext == null || (str3 = shortVideoContext.f155831p) == null)) {
            str4 = str3;
        }
        C84425b a2 = a.mo129406a("shoot_way", str4);
        if (z) {
            str2 = "multiple";
        } else {
            str2 = "single";
        }
        C39162r.m79460a("change_upload_mode", a2.mo129406a("to_status", str2).f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b.AbstractC72165c
    /* renamed from: a */
    public final void mo114412a(long j, long j2) {
        C80322d.m139251a("upload_page_duration", new C84425b().mo129404a("first_selection_duration", System.currentTimeMillis() - j).mo129404a("page_stay_duration", System.currentTimeMillis() - j2).f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b.AbstractC72165c
    /* renamed from: a */
    public final void mo114413a(ShortVideoContext shortVideoContext, MediaState mediaState) {
        String str;
        String str2;
        int i;
        String str3;
        String str4 = "";
        C89219l.m154721d(mediaState, str4);
        if (mediaState.getMedia() != null) {
            C84425b bVar = new C84425b();
            if (shortVideoContext == null || (str = shortVideoContext.f155830o) == null) {
                str = str4;
            }
            C84425b a = bVar.mo129406a("creation_id", str);
            if (!(shortVideoContext == null || (str3 = shortVideoContext.f155831p) == null)) {
                str4 = str3;
            }
            C84425b a2 = a.mo129406a("shoot_way", str4);
            if (mediaState.getMedia().mo96674b()) {
                str2 = "video";
            } else {
                str2 = UGCMonitor.TYPE_PHOTO;
            }
            C84425b a3 = a2.mo129406a("content_type", str2);
            if (mediaState.getMedia().f161471v >= 0) {
                i = 1;
            } else {
                i = 0;
            }
            C39162r.m79460a("slide_content_detail", a3.mo129403a("is_select", i).f188764a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b.AbstractC72165c
    /* renamed from: a */
    public final void mo114414a(ShortVideoContext shortVideoContext, MvImageChooseAdapter.MyMediaModel myMediaModel) {
        String str;
        String str2;
        int i;
        String str3;
        String str4 = "";
        C89219l.m154721d(myMediaModel, str4);
        C84425b bVar = new C84425b();
        if (shortVideoContext == null || (str = shortVideoContext.f155830o) == null) {
            str = str4;
        }
        C84425b a = bVar.mo129406a("creation_id", str);
        if (!(shortVideoContext == null || (str3 = shortVideoContext.f155831p) == null)) {
            str4 = str3;
        }
        C84425b a2 = a.mo129406a("shoot_way", str4);
        if (myMediaModel.mo96674b()) {
            str2 = "video";
        } else {
            str2 = UGCMonitor.TYPE_PHOTO;
        }
        C84425b a3 = a2.mo129406a("content_type", str2);
        if (myMediaModel.f161471v >= 0) {
            i = 1;
        } else {
            i = 0;
        }
        C39162r.m79460a("click_content_detail", a3.mo129403a("is_select", i).f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b.AbstractC72165c
    /* renamed from: a */
    public final void mo114416a(ShortVideoContext shortVideoContext, String str) {
        C89219l.m154721d(str, "");
        if (shortVideoContext != null) {
            C39162r.m79460a("click_upload_tab", new C84425b().mo129406a("creation_id", shortVideoContext.f155830o).mo129406a("shoot_way", shortVideoContext.f155831p).mo129406a("tab_name", str).f188764a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b.AbstractC72165c
    /* renamed from: a */
    public final void mo114415a(ShortVideoContext shortVideoContext, MvImageChooseAdapter.EnumC72047b bVar, String str) {
        String str2;
        C84425b bVar2 = new C84425b();
        bVar2.mo129406a("content_source", "upload");
        bVar2.mo129406a("content_type", "mv");
        bVar2.mo129406a("upload_type", "multiple_content");
        if (shortVideoContext == null || (str2 = shortVideoContext.f155830o) == null) {
            str2 = "";
        }
        bVar2.mo129406a("creation_id", str2);
        if (bVar != null) {
            bVar2.mo129403a("in_detail", bVar.value);
        }
        if (str != null) {
            bVar2.mo129406a("material_ratio", str);
        }
        C39162r.m79460a("choose_upload_content", bVar2.f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.p3844b.AbstractC72165c
    /* renamed from: a */
    public final void mo114417a(ShortVideoContext shortVideoContext, List<? extends MvImageChooseAdapter.MyMediaModel> list, MvImageChooseAdapter.EnumC72047b bVar, String str) {
        String str2;
        long j = 0;
        if (list != null && (!list.isEmpty())) {
            for (MediaModel mediaModel : list) {
                j += mediaModel.f134668h;
            }
        }
        C84425b bVar2 = new C84425b();
        bVar2.mo129406a("content_type", "sound_sync");
        bVar2.mo129406a("upload_type", "multiple_content");
        if (shortVideoContext == null || (str2 = shortVideoContext.f155830o) == null) {
            str2 = "";
        }
        bVar2.mo129406a("creation_id", str2);
        if (bVar != null) {
            bVar2.mo129403a("in_detail", bVar.value);
        }
        if (str != null) {
            bVar2.mo129406a("material_ratio", str);
        }
        bVar2.mo129404a("duration_ms", j);
        C39162r.m79460a("choose_upload_content", bVar2.f188764a);
    }
}
