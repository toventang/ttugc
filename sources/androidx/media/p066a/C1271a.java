package androidx.media.p066a;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.res.Resources;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.p010v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.AbstractC0594h;
import androidx.core.app.C0595i;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: androidx.media.a.a */
public final class C1271a {
    static {
        Covode.recordClassIndex(1384);
    }

    /* renamed from: androidx.media.a.a$a */
    public static class C1272a extends C0595i.AbstractC0604h {

        /* renamed from: a */
        int[] f4190a;

        /* renamed from: b */
        public MediaSessionCompat.Token f4191b;

        /* renamed from: c */
        boolean f4192c;

        /* renamed from: h */
        PendingIntent f4193h;

        static {
            Covode.recordClassIndex(1385);
        }

        /* renamed from: c */
        public final C1272a mo4249c() {
            if (Build.VERSION.SDK_INT < 21) {
                this.f4192c = true;
            }
            return this;
        }

        @Override // androidx.core.app.C0595i.AbstractC0604h
        /* renamed from: b */
        public final RemoteViews mo2636b() {
            int i;
            if (Build.VERSION.SDK_INT >= 21) {
                return null;
            }
            int min = Math.min(this.f2555d.f2519b.size(), 5);
            if (min <= 3) {
                i = R.layout.alp;
            } else {
                i = R.layout.aln;
            }
            RemoteViews a = mo2634a(i, false);
            a.removeAllViews(R.id.ciz);
            if (min > 0) {
                int i2 = 0;
                do {
                    a.addView(R.id.ciz, m4035a(this.f2555d.f2519b.get(i2)));
                    i2++;
                } while (i2 < min);
            }
            if (this.f4192c) {
                a.setViewVisibility(R.id.a0y, 0);
                a.setInt(R.id.a0y, "setAlpha", m4034a(this.f2555d.f2518a.getResources()));
                a.setOnClickPendingIntent(R.id.a0y, this.f4193h);
            } else {
                a.setViewVisibility(R.id.a0y, 8);
            }
            return a;
        }

        @Override // androidx.core.app.C0595i.AbstractC0604h
        /* renamed from: a */
        public final RemoteViews mo2633a() {
            int min;
            if (Build.VERSION.SDK_INT >= 21) {
                return null;
            }
            RemoteViews a = mo2634a(R.layout.alu, true);
            int size = this.f2555d.f2519b.size();
            int[] iArr = this.f4190a;
            if (iArr == null) {
                min = 0;
            } else {
                min = Math.min(iArr.length, 3);
            }
            a.removeAllViews(R.id.ciz);
            if (min > 0) {
                int i = 0;
                while (i < size) {
                    a.addView(R.id.ciz, m4035a(this.f2555d.f2519b.get(this.f4190a[i])));
                    i++;
                    if (i >= min) {
                    }
                }
                throw new IllegalArgumentException(C1764a.m5928a("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(size - 1)}));
            }
            if (this.f4192c) {
                a.setViewVisibility(R.id.avl, 8);
                a.setViewVisibility(R.id.a0y, 0);
                a.setOnClickPendingIntent(R.id.a0y, this.f4193h);
                a.setInt(R.id.a0y, "setAlpha", m4034a(this.f2555d.f2518a.getResources()));
            } else {
                a.setViewVisibility(R.id.avl, 0);
                a.setViewVisibility(R.id.a0y, 8);
            }
            return a;
        }

        /* renamed from: a */
        public final C1272a mo4246a(PendingIntent pendingIntent) {
            this.f4193h = pendingIntent;
            return this;
        }

        /* renamed from: a */
        public final C1272a mo4247a(MediaSessionCompat.Token token) {
            this.f4191b = token;
            return this;
        }

        /* renamed from: a */
        public final C1272a mo4248a(int... iArr) {
            this.f4190a = iArr;
            return this;
        }

        /* renamed from: a */
        private RemoteViews m4035a(C0595i.C0596a aVar) {
            boolean z;
            if (aVar.f2487j == null) {
                z = true;
            } else {
                z = false;
            }
            RemoteViews remoteViews = new RemoteViews(this.f2555d.f2518a.getPackageName(), (int) R.layout.alk);
            remoteViews.setImageViewResource(R.id.bv, aVar.f2485h);
            if (!z) {
                remoteViews.setOnClickPendingIntent(R.id.bv, aVar.f2487j);
            }
            int i = Build.VERSION.SDK_INT;
            remoteViews.setContentDescription(R.id.bv, aVar.f2486i);
            return remoteViews;
        }

        /* renamed from: a */
        private static int m4034a(Resources resources) {
            ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(R.integer.am);
            if (matchConfig == null) {
                return resources.getInteger(R.integer.am);
            }
            try {
                if (!matchConfig.mockCrash) {
                    return resources.getInteger(R.integer.am);
                }
                throw new Resources.NotFoundException("unknown resource from mocked");
            } catch (Throwable th) {
                StackTraceElement[] stackTrace = th.getStackTrace();
                int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
                for (int i = 0; i < min; i++) {
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (stackTraceElement != null) {
                        if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                            if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                                return matchConfig.mReturnIdWhenException;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return resources.getInteger(R.integer.am);
            }
        }

        @Override // androidx.core.app.C0595i.AbstractC0604h
        /* renamed from: a */
        public final void mo2599a(AbstractC0594h hVar) {
            if (Build.VERSION.SDK_INT >= 21) {
                Notification.Builder a = hVar.mo2595a();
                Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
                int[] iArr = this.f4190a;
                if (iArr != null) {
                    mediaStyle.setShowActionsInCompactView(iArr);
                }
                MediaSessionCompat.Token token = this.f4191b;
                if (token != null) {
                    mediaStyle.setMediaSession((MediaSession.Token) token.f355a);
                }
                a.setStyle(mediaStyle);
            } else if (this.f4192c) {
                hVar.mo2595a().setOngoing(true);
            }
        }
    }
}
