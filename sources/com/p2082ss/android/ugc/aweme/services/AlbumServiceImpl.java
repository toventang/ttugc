package com.p2082ss.android.ugc.aweme.services;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.AbstractC22233n;
import com.bytedance.scene.C22217i;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.record.AbstractC66808b;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72084ao;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72182bp;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.AlbumServiceImpl */
public final class AlbumServiceImpl implements AbstractC66808b {
    public static final Companion Companion = new Companion(null);

    static {
        Covode.recordClassIndex(79574);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.AlbumServiceImpl$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(79575);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66808b
    public final void subscribeAlbumClose(ActivityC0945e eVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aVar, "");
        JediViewModel a = C20531t.m38716a(eVar).mo33800a(ChooseMediaViewModel.class);
        C89219l.m154716b(a, "");
        AbstractC88412b unused = ((ChooseMediaViewModel) a).mo33677a(eVar, AlbumServiceImpl$subscribeAlbumClose$1.INSTANCE, new C20370ah(), new AlbumServiceImpl$subscribeAlbumClose$2(aVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66808b
    public final void subscribeAlbumOpen(ActivityC0945e eVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aVar, "");
        JediViewModel a = C20531t.m38716a(eVar).mo33800a(ChooseMediaViewModel.class);
        C89219l.m154716b(a, "");
        AbstractC88412b unused = ((ChooseMediaViewModel) a).mo33677a(eVar, AlbumServiceImpl$subscribeAlbumOpen$1.INSTANCE, new C20370ah(), new AlbumServiceImpl$subscribeAlbumOpen$2(aVar));
    }

    private final Bundle generateAlbumBundle(ShortVideoContext shortVideoContext, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt("key_support_flag", 5);
        bundle2.putLong("Key_min_duration", 1000);
        bundle2.putInt("key_photo_select_min_count", 1);
        bundle2.putInt("key_photo_select_max_count", 10);
        bundle2.putInt("key_video_select_min_count", 1);
        bundle2.putInt("key_video_select_max_count", 10);
        bundle2.putInt("key_choose_scene", 11);
        bundle2.putParcelable("key_short_video_context", shortVideoContext);
        bundle2.putInt("key_choose_request_code", 1);
        bundle2.putBoolean("from_upload_btn_click", true);
        bundle2.putAll(bundle);
        return bundle2;
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66808b
    public final C89386u<Boolean, Integer, Long> checkMediaDurationValid(Context context, List<? extends MediaModel> list, long j, long j2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(list, "");
        return C72182bp.m127372a(context, list, j, j2);
    }

    @Override // com.p2082ss.android.ugc.aweme.record.AbstractC66808b
    public final AbstractC22233n openAlbum(ShortVideoContext shortVideoContext, ActivityC0945e eVar, int i, AbstractC84919c cVar, Bundle bundle) {
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bundle, "");
        C72084ao aoVar = new C72084ao();
        aoVar.f52554r = generateAlbumBundle(shortVideoContext, bundle);
        aoVar.f161621ac = cVar;
        aoVar.f161620ab = true;
        C22217i.C22218a a = C22217i.m41761a(eVar, C72084ao.class);
        a.f52533e = false;
        C22217i.C22218a a2 = a.mo36468a("attachMvChoosePhotoScene");
        a2.f52534f = new AlbumServiceImpl$openAlbum$delegate$1(aoVar);
        a2.f52530b = false;
        a2.f52531c = false;
        a2.f52532d = i;
        AbstractC22233n a3 = a2.mo36469a();
        C89219l.m154716b(a3, "");
        return a3;
    }
}
