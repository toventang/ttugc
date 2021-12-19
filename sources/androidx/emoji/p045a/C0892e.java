package androidx.emoji.p045a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.core.graphics.C0715e;
import androidx.core.graphics.C0725l;
import androidx.core.p034e.C0656a;
import androidx.core.p034e.C0657b;
import androidx.core.p036g.C0697g;
import androidx.emoji.p045a.C0877a;
import androidx.emoji.p045a.C0899f;
import androidx.p057k.p058a.p059a.C1071b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: androidx.emoji.a.e */
public final class C0892e extends C0877a.AbstractC0881c {

    /* renamed from: i */
    private static final C0893a f3233i = new C0893a();

    /* renamed from: androidx.emoji.a.e$a */
    public static class C0893a {
        static {
            Covode.recordClassIndex(979);
        }
    }

    /* renamed from: androidx.emoji.a.e$c */
    public static abstract class AbstractC0898c {
        static {
            Covode.recordClassIndex(984);
        }

        /* renamed from: a */
        public abstract long mo3191a();
    }

    static {
        Covode.recordClassIndex(978);
    }

    /* renamed from: androidx.emoji.a.e$b */
    static class C0894b implements C0877a.AbstractC0884f {

        /* renamed from: a */
        C0877a.AbstractC0885g f3234a;

        /* renamed from: b */
        private final Context f3235b;

        /* renamed from: c */
        private final C0656a f3236c;

        /* renamed from: d */
        private final C0893a f3237d;

        /* renamed from: e */
        private final Object f3238e = new Object();

        /* renamed from: f */
        private Handler f3239f;

        /* renamed from: g */
        private HandlerThread f3240g;

        /* renamed from: h */
        private AbstractC0898c f3241h;

        /* renamed from: i */
        private ContentObserver f3242i;

        /* renamed from: j */
        private Runnable f3243j;

        static {
            Covode.recordClassIndex(980);
        }

        /* renamed from: c */
        private void m3090c() {
            this.f3234a = null;
            ContentObserver contentObserver = this.f3242i;
            if (contentObserver != null) {
                this.f3235b.getContentResolver().unregisterContentObserver(contentObserver);
                this.f3242i = null;
            }
            synchronized (this.f3238e) {
                this.f3239f.removeCallbacks(this.f3243j);
                HandlerThread handlerThread = this.f3240g;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                this.f3239f = null;
                this.f3240g = null;
            }
        }

        /* renamed from: b */
        private C0657b.C0663b m3089b() {
            try {
                C0657b.C0662a a = C0657b.m2395a(this.f3235b, this.f3236c);
                if (a.f2672a == 0) {
                    C0657b.C0663b[] bVarArr = a.f2673b;
                    if (bVarArr != null && bVarArr.length != 0) {
                        return bVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + a.f2672a + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo3187a() {
            if (this.f3234a != null) {
                try {
                    C0657b.C0663b b = m3089b();
                    int i = b.f2678e;
                    if (i == 2) {
                        synchronized (this.f3238e) {
                            AbstractC0898c cVar = this.f3241h;
                            if (cVar != null) {
                                long a = cVar.mo3191a();
                                if (a >= 0) {
                                    Uri uri = b.f2674a;
                                    synchronized (this.f3238e) {
                                        if (this.f3242i == null) {
                                            C08962 r1 = new ContentObserver(this.f3239f) {
                                                /* class androidx.emoji.p045a.C0892e.C0894b.C08962 */

                                                static {
                                                    Covode.recordClassIndex(982);
                                                }

                                                public final void onChange(boolean z, Uri uri) {
                                                    C0894b.this.mo3187a();
                                                }
                                            };
                                            this.f3242i = r1;
                                            this.f3235b.getContentResolver().registerContentObserver(uri, false, r1);
                                        }
                                        if (this.f3243j == null) {
                                            this.f3243j = new Runnable() {
                                                /* class androidx.emoji.p045a.C0892e.C0894b.RunnableC08973 */

                                                static {
                                                    Covode.recordClassIndex(983);
                                                }

                                                public final void run() {
                                                    C0894b.this.mo3187a();
                                                }
                                            };
                                        }
                                        this.f3239f.postDelayed(this.f3243j, a);
                                    }
                                    return;
                                }
                            }
                        }
                    } else if (i == 0) {
                        Typeface a2 = C0715e.m2526a(this.f3235b, new C0657b.C0663b[]{b}, 0);
                        ByteBuffer a3 = C0725l.m2576a(this.f3235b, (CancellationSignal) null, b.f2674a);
                        if (a3 != null) {
                            C0877a.AbstractC0885g gVar = this.f3234a;
                            ByteBuffer duplicate = a3.duplicate();
                            duplicate.position((int) C0899f.m3094a(new C0899f.C0900a(duplicate)).f3249a);
                            C1071b bVar = new C1071b();
                            duplicate.order(ByteOrder.LITTLE_ENDIAN);
                            bVar.mo3826a(duplicate.getInt(duplicate.position()) + duplicate.position(), duplicate);
                            gVar.mo3173a(new C0903g(a2, bVar));
                            m3090c();
                            return;
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                } catch (Throwable th) {
                    this.f3234a.mo3174a(th);
                    m3090c();
                }
            }
        }

        @Override // androidx.emoji.p045a.C0877a.AbstractC0884f
        /* renamed from: a */
        public final void mo3177a(final C0877a.AbstractC0885g gVar) {
            C0697g.m2453a(gVar, "LoaderCallback cannot be null");
            synchronized (this.f3238e) {
                if (this.f3239f == null) {
                    HandlerThread handlerThread = new HandlerThread("emojiCompat", 10);
                    this.f3240g = handlerThread;
                    handlerThread.start();
                    this.f3239f = new Handler(this.f3240g.getLooper());
                }
                this.f3239f.post(new Runnable() {
                    /* class androidx.emoji.p045a.C0892e.C0894b.RunnableC08951 */

                    static {
                        Covode.recordClassIndex(981);
                    }

                    public final void run() {
                        C0894b.this.f3234a = gVar;
                        C0894b.this.mo3187a();
                    }
                });
            }
        }

        C0894b(Context context, C0656a aVar, C0893a aVar2) {
            C0697g.m2453a(context, "Context cannot be null");
            C0697g.m2453a(aVar, "FontRequest cannot be null");
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f3235b = applicationContext;
            this.f3236c = aVar;
            this.f3237d = aVar2;
        }
    }

    public C0892e(Context context, C0656a aVar) {
        super(new C0894b(context, aVar, f3233i));
    }
}
