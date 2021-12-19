package com.p2082ss.android.ugc.gamora.recorder.sticker;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59174d;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59178e;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.C59187c;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.BackgroundVideoCompileConfigure;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70044a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72053aa;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.AbstractC75935g;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.AbstractC75936h;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.AbstractC75937i;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.C75924a;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c */
public final class C83962c {
    static {
        Covode.recordClassIndex(97855);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c$a */
    public static final class C83963a implements AbstractC75937i {
        static {
            Covode.recordClassIndex(97856);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.AbstractC75937i
        /* renamed from: a */
        public final void mo119600a() {
            C59187c cVar = C59187c.f134693a;
            if (cVar != null) {
                cVar.mo96693b();
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c$a$a */
        public static final class C83964a implements AbstractC59178e {

            /* renamed from: a */
            final /* synthetic */ AbstractC89183m f187437a;

            static {
                Covode.recordClassIndex(97857);
            }

            C83964a(AbstractC89183m mVar) {
                this.f187437a = mVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59178e
            /* renamed from: a */
            public final void mo96652a(boolean z, int i, List<MediaModel> list, AbstractC59174d dVar) {
                C89219l.m154721d(dVar, "");
                this.f187437a.invoke(Boolean.valueOf(z), list);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.AbstractC75937i
        /* renamed from: a */
        public final void mo119601a(AbstractC89183m<? super Boolean, ? super List<? extends MediaModel>, C89391z> mVar) {
            C89219l.m154721d(mVar, "");
            C59187c.f134693a.mo96691a(4, 100, 0, new C83964a(mVar));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c$b */
    public static final class C83965b implements AbstractC75935g {

        /* renamed from: a */
        final /* synthetic */ ShortVideoContext f187438a;

        static {
            Covode.recordClassIndex(97858);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.AbstractC75935g
        /* renamed from: a */
        public final Bundle mo119596a() {
            Bundle bundle = new Bundle();
            bundle.putInt("key_choose_scene", 4);
            bundle.putInt("key_video_select_min_count", 1);
            bundle.putInt("key_video_select_max_count", 1);
            bundle.putInt("key_support_flag", 4);
            bundle.putParcelable("key_short_video_context", this.f187438a);
            return bundle;
        }

        public C83965b(ShortVideoContext shortVideoContext) {
            this.f187438a = shortVideoContext;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.AbstractC75935g
        /* renamed from: a */
        public final C75924a mo119597a(Intent intent) {
            C89219l.m154721d(intent, "");
            String a = m144416a(intent, "videoPath");
            if (a == null) {
                a = "";
            }
            C89219l.m154716b(a, "");
            String a2 = m144416a(intent, "audioPath");
            if (a2 == null) {
                a2 = "";
            }
            C89219l.m154716b(a2, "");
            String a3 = m144416a(intent, "videoOriginPath");
            if (a3 == null) {
                a3 = "";
            }
            C89219l.m154716b(a3, "");
            return new C75924a(a, a2, a3);
        }

        /* renamed from: a */
        private static String m144416a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c$c */
    public static final class C83966c implements AbstractC75936h {

        /* renamed from: a */
        final /* synthetic */ ShortVideoContext f187439a;

        static {
            Covode.recordClassIndex(97859);
        }

        public C83966c(ShortVideoContext shortVideoContext) {
            this.f187439a = shortVideoContext;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.AbstractC75936h
        /* renamed from: a */
        public final C75924a mo119599a(Intent intent) {
            C89219l.m154721d(intent, "");
            String a = m144419a(intent, "videoPath");
            if (a == null) {
                a = "";
            }
            C89219l.m154716b(a, "");
            String a2 = m144419a(intent, "audioPath");
            if (a2 == null) {
                a2 = "";
            }
            C89219l.m154716b(a2, "");
            String a3 = m144419a(intent, "videoOriginPath");
            if (a3 == null) {
                a3 = "";
            }
            C89219l.m154716b(a3, "");
            return new C75924a(a, a2, a3);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.AbstractC75936h
        /* renamed from: a */
        public final Intent mo119598a(String str) {
            BackgroundVideoCompileConfigure backgroundVideoCompileConfigure;
            C89219l.m154721d(str, "");
            Intent intent = new Intent();
            intent.putExtra("file_path", str);
            intent.putExtra("from_background_video", true);
            intent.putExtra("background_video_max_length", C63244g.m114602a().mo73284l().getMaxDurationResolver().resolveMaxDurationFor3MinWithMusic(this.f187439a, C63244g.m114602a().mo73284l().getMaxDurationResolver().getMaxShootingDuration(true ^ this.f187439a.f155817b.f155664t, this.f187439a)));
            Workspace workspace = this.f187439a.f155817b.f155652h;
            if (workspace != null) {
                backgroundVideoCompileConfigure = C70044a.m123683a(workspace);
            } else {
                backgroundVideoCompileConfigure = null;
            }
            intent.putExtra("background_video_compile_configure", backgroundVideoCompileConfigure);
            return intent;
        }

        /* renamed from: a */
        private static String m144419a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c$d */
    public static final class C83967d extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f187440a;

        static {
            Covode.recordClassIndex(97860);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83967d(ActivityC0945e eVar) {
            super(1);
            this.f187440a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            C72053aa.m127203a(this.f187440a, num.intValue(), 1000);
            return C89391z.f203057a;
        }
    }
}
