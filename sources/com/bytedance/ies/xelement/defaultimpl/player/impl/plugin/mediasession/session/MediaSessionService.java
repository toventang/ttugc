package com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.p010v4.media.MediaBrowserCompat;
import androidx.media.AbstractServiceC1278e;
import androidx.p051h.p052a.C0998a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

public class MediaSessionService extends AbstractServiceC1278e {

    /* renamed from: f */
    public static final C19240a f45449f = new C19240a((byte) 0);

    static {
        Covode.recordClassIndex(22007);
    }

    @Override // androidx.media.AbstractServiceC1278e
    /* renamed from: a */
    public final AbstractServiceC1278e.C1283a mo4257a(String str) {
        C89219l.m154719c(str, "");
        return null;
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.MediaSessionService$a */
    public static final class C19240a {
        static {
            Covode.recordClassIndex(22008);
        }

        private C19240a() {
        }

        public /* synthetic */ C19240a(byte b) {
            this();
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.MediaSessionService$b */
    public static class BinderC19241b extends Binder {

        /* renamed from: a */
        public final MediaSessionService f45450a;

        static {
            Covode.recordClassIndex(22009);
        }

        /* renamed from: a */
        public final void mo30593a() {
            try {
                this.f45450a.stopForeground(false);
            } catch (Throwable unused) {
            }
        }

        public BinderC19241b(MediaSessionService mediaSessionService) {
            C89219l.m154719c(mediaSessionService, "");
            this.f45450a = mediaSessionService;
        }
    }

    @Override // androidx.media.AbstractServiceC1278e
    public IBinder onBind(Intent intent) {
        return new BinderC19241b(this);
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override // androidx.media.AbstractServiceC1278e
    /* renamed from: a */
    public final void mo4259a(String str, AbstractServiceC1278e.C1297i<List<MediaBrowserCompat.MediaItem>> iVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(iVar, "");
        iVar.mo4278c();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        Intent intent2 = new Intent("player.plugin.mediasession.common.intent.filter.AWE_MEDIA_SESSION_BROADCAST");
        intent2.putExtra("EXTRA_MEDIA_BUTTON_DATA", intent);
        C0998a.m3454a(this).mo3694a(intent2);
        return super.onStartCommand(intent, i, i2);
    }
}
