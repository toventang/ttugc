package com.p2082ss.android.ugc.aweme.choosemusic.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.widget.Toast;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.music.C60789f;
import com.p2082ss.android.ugc.aweme.music.p3481ui.AbstractC61180m;
import com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.musicprovider.C84157d;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84160a;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84161b;
import com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84162c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.utils.AVMusicDownloadPlayHelper */
public final class AVMusicDownloadPlayHelper extends MusicDownloadPlayHelper implements AbstractC33974au {

    /* renamed from: b */
    public static final C35926a f84794b = new C35926a((byte) 0);

    /* renamed from: a */
    public final AbstractC61180m f84795a;

    /* renamed from: v */
    private final AbstractC89244h f84796v = C89250i.m154773a((AbstractC89171a) C35929d.f84801a);

    /* renamed from: w */
    private Handler f84797w;

    /* renamed from: x */
    private Toast f84798x;

    static {
        Covode.recordClassIndex(43166);
    }

    /* renamed from: a */
    public final HandlerThread mo63040a() {
        return (HandlerThread) this.f84796v.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.utils.AVMusicDownloadPlayHelper$a */
    public static final class C35926a {
        static {
            Covode.recordClassIndex(43167);
        }

        private C35926a() {
        }

        public /* synthetic */ C35926a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.utils.AVMusicDownloadPlayHelper$d */
    static final class C35929d extends AbstractC89220m implements AbstractC89171a<HandlerThread> {

        /* renamed from: a */
        public static final C35929d f84801a = new C35929d();

        static {
            Covode.recordClassIndex(43170);
        }

        C35929d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HandlerThread invoke() {
            HandlerThread handlerThread = new HandlerThread("av_player_thread");
            handlerThread.start();
            return handlerThread;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper
    /* renamed from: b */
    public final void mo63043b() {
        this.f138610f.mo128981a(new C35927b(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper
    /* renamed from: c */
    public final void mo63044c() {
        if (this.f138621q != null) {
            this.f138621q.cancel();
        }
        C84157d dVar = this.f138610f;
        if (dVar != null) {
            dVar.mo128984b();
        }
        Handler handler = this.f84797w;
        if (handler != null) {
            Message obtain = Message.obtain();
            obtain.what = 2;
            handler.sendMessage(obtain);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper, com.p2082ss.android.ugc.aweme.music.AbstractC60326a
    /* renamed from: d */
    public final void mo63045d() {
        super.mo63045d();
        mo63040a().quit();
        Handler handler = this.f84797w;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f138610f.mo128979a((AbstractC84160a) null);
        this.f138610f.mo128980a((AbstractC84161b) null);
        this.f138610f.mo128981a((AbstractC84162c) null);
        this.f138610f.mo128977a();
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.utils.AVMusicDownloadPlayHelper$b */
    static final class C35927b implements AbstractC84162c {

        /* renamed from: a */
        final /* synthetic */ AVMusicDownloadPlayHelper f84799a;

        static {
            Covode.recordClassIndex(43168);
        }

        C35927b(AVMusicDownloadPlayHelper aVMusicDownloadPlayHelper) {
            this.f84799a = aVMusicDownloadPlayHelper;
        }

        @Override // com.p2082ss.android.ugc.musicprovider.interfaces.AbstractC84162c
        /* renamed from: a */
        public final void mo63046a(int i) {
            this.f84799a.f84795a.mo62876a(this.f84799a.f138619o, 0);
        }
    }

    /* renamed from: a */
    private static void m73290a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            C80567ic.m139657a(toast);
        }
        toast.show();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AVMusicDownloadPlayHelper(AbstractC61180m mVar) {
        super(mVar);
        C89219l.m154721d(mVar, "");
        this.f84795a = mVar;
        Activity i = mVar.mo62886i();
        C89219l.m154716b(i, "");
        C60789f fVar = new C60789f(i, true, true, true, "av_record_player_music");
        fVar.f138135a = 1;
        this.f138611g = fVar;
        mo63043b();
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.utils.AVMusicDownloadPlayHelper$c */
    static final class C35928c implements Handler.Callback {

        /* renamed from: a */
        final /* synthetic */ AVMusicDownloadPlayHelper f84800a;

        static {
            Covode.recordClassIndex(43169);
        }

        C35928c(AVMusicDownloadPlayHelper aVMusicDownloadPlayHelper) {
            this.f84800a = aVMusicDownloadPlayHelper;
        }

        public final boolean handleMessage(Message message) {
            C89219l.m154721d(message, "");
            int i = message.what;
            if (i == 1) {
                Object obj = message.obj;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.utils.PlayMusicInfo");
                C35947f fVar = (C35947f) obj;
                AVMusicDownloadPlayHelper.super.mo63041a((AVMusicDownloadPlayHelper) fVar.f84840a, (MusicModel) fVar.f84841b, (int) fVar.f84842c);
            } else if (i == 2) {
                C84157d dVar = this.f84800a.f138610f;
                if (dVar != null) {
                    dVar.mo128984b();
                }
            } else if (i == 3) {
                this.f84800a.mo63040a().quit();
                C84157d dVar2 = this.f84800a.f138610f;
                if (dVar2 != null) {
                    dVar2.mo128977a();
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private final void m73289a(Context context, String str) {
        Toast toast = this.f84798x;
        if (toast != null) {
            toast.cancel();
        }
        Toast makeText = Toast.makeText(context, str, 0);
        makeText.setGravity(17, 0, 0);
        this.f84798x = makeText;
        m73290a(makeText);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper
    /* renamed from: a */
    public final boolean mo63042a(MusicModel musicModel, Context context) {
        C89219l.m154721d(context, "");
        if (musicModel != null && !musicModel.isPlayUrlValid()) {
            String string = context.getString(R.string.dav);
            C89219l.m154716b(string, "");
            m73289a(context, string);
            return false;
        } else if (musicModel == null || musicModel.getMusicStatus() != 0) {
            return true;
        } else {
            String offlineDesc = musicModel.getOfflineDesc();
            C89219l.m154716b(offlineDesc, "");
            if (offlineDesc.length() == 0) {
                offlineDesc = context.getString(R.string.dau);
            }
            C89219l.m154716b(offlineDesc, "");
            m73289a(context, offlineDesc);
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.MusicDownloadPlayHelper, com.p2082ss.android.ugc.aweme.music.AbstractC60326a
    /* renamed from: a */
    public final void mo63041a(MusicModel musicModel, int i, boolean z) {
        if (this.f84797w == null) {
            this.f84797w = new Handler(mo63040a().getLooper(), new C35928c(this));
        }
        Handler handler = this.f84797w;
        if (handler != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = new C35947f(musicModel, i, z);
            handler.sendMessage(obtain);
        }
    }
}
