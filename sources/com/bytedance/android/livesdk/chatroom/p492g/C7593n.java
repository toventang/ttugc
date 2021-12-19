package com.bytedance.android.livesdk.chatroom.p492g;

import android.content.Context;
import android.os.Environment;
import com.bytedance.android.live.core.p210a.p211a.C3828a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.common.utility.p909d.C13609b;
import com.bytedance.common.utility.reflect.C13635a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdk.chatroom.g.n */
public class C7593n {

    /* renamed from: a */
    private static volatile C7593n f18827a;

    /* renamed from: b */
    private C3828a f18828b;

    /* renamed from: c */
    private Map<String, Object> f18829c;

    /* renamed from: d */
    private final int f18830d = 100;

    static {
        Covode.recordClassIndex(8366);
    }

    /* renamed from: b */
    private static File m15608b(Context context) {
        if (C58016d.f132220a != null && C58016d.f132224e) {
            return C58016d.f132220a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        C58016d.f132220a = externalCacheDir;
        return externalCacheDir;
    }

    /* renamed from: a */
    public final AbstractC88979t<Long> mo13832a(String str) {
        return AbstractC88979t.m154310b(str).mo143267a((AbstractC88434g) new AbstractC88434g<String, AbstractC88984x<Long>>() {
            /* class com.bytedance.android.livesdk.chatroom.p492g.C7593n.C75941 */

            static {
                Covode.recordClassIndex(8367);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ AbstractC88984x<Long> apply(String str) {
                return AbstractC88979t.m154310b(Long.valueOf(C7593n.this.mo13835b(str)));
            }
        }, false).mo143278b(C88925a.m154180b(C88946a.f201991c));
    }

    /* renamed from: a */
    public static C7593n m15607a(Context context) {
        MethodCollector.m26663i(10687);
        if (f18827a == null) {
            synchronized (C7593n.class) {
                try {
                    if (f18827a == null) {
                        f18827a = new C7593n(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10687);
                    throw th;
                }
            }
        }
        C7593n nVar = f18827a;
        MethodCollector.m26664o(10687);
        return nVar;
    }

    /* renamed from: b */
    public final synchronized long mo13835b(String str) {
        Throwable th;
        MethodCollector.m26663i(10691);
        long j = 0;
        if (this.f18828b == null) {
            MethodCollector.m26664o(10691);
            return 0;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedInputStream bufferedInputStream = null;
        try {
            C3828a.C3834c a = this.f18828b.mo9176a(str);
            if (a == null) {
                C13609b.m24451a((Closeable) null);
                C13609b.m24451a(byteArrayOutputStream);
                MethodCollector.m26664o(10691);
                return 0;
            }
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(a.f10601a[0]);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = bufferedInputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.put(byteArray);
                allocate.flip();
                j = allocate.getLong();
                C13609b.m24451a(bufferedInputStream2);
            } catch (Exception unused) {
                bufferedInputStream = bufferedInputStream2;
                C13609b.m24451a(bufferedInputStream);
                C13609b.m24451a(byteArrayOutputStream);
                MethodCollector.m26664o(10691);
                return j;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream2;
                C13609b.m24451a(bufferedInputStream);
                C13609b.m24451a(byteArrayOutputStream);
                MethodCollector.m26664o(10691);
                throw th;
            }
            C13609b.m24451a(byteArrayOutputStream);
            MethodCollector.m26664o(10691);
            return j;
        } catch (Exception unused2) {
            C13609b.m24451a(bufferedInputStream);
            C13609b.m24451a(byteArrayOutputStream);
            MethodCollector.m26664o(10691);
            return j;
        } catch (Throwable th3) {
            th = th3;
            C13609b.m24451a(bufferedInputStream);
            C13609b.m24451a(byteArrayOutputStream);
            MethodCollector.m26664o(10691);
            throw th;
        }
    }

    private C7593n(Context context) {
        File file;
        try {
            C3828a aVar = this.f18828b;
            if (aVar != null) {
                aVar.close();
                this.f18828b = null;
            }
            if (("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) && m15608b(context) != null) {
                file = m15608b(context);
            } else {
                if (C58016d.f132221b == null || !C58016d.f132224e) {
                    C58016d.f132221b = context.getCacheDir();
                }
                file = C58016d.f132221b;
            }
            C3828a a = C3828a.m9388a(new File(file.getPath() + File.separator + "shareClikedCache"));
            this.f18828b = a;
            Map<String, Object> map = (Map) C13635a.m24534a(a, "lruEntries");
            this.f18829c = map;
            if (map != null) {
                C3854a.m9453a(6, "yyy", "entries: " + this.f18829c.size());
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    public final void mo13833a(final String str, final long j) {
        AbstractC88979t.m154310b(Long.valueOf(j)).mo143267a((AbstractC88434g) new AbstractC88434g<Long, AbstractC88979t<byte[]>>() {
            /* class com.bytedance.android.livesdk.chatroom.p492g.C7593n.C75963 */

            static {
                Covode.recordClassIndex(8369);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ AbstractC88979t<byte[]> apply(Long l) {
                long longValue = l.longValue();
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.putLong(longValue);
                return AbstractC88979t.m154306a(allocate.array());
            }
        }, false).mo143280b((AbstractC88433f) new C7597o(this, str)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new AbstractC88433f<byte[]>() {
            /* class com.bytedance.android.livesdk.chatroom.p492g.C7593n.C75952 */

            static {
                Covode.recordClassIndex(8368);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(byte[] bArr) {
                C3854a.m9456a("entries key = " + str + ",value = " + j);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo13834a(String str, byte[] bArr) {
        MethodCollector.m26663i(10689);
        C3828a aVar = this.f18828b;
        if (aVar == null) {
            MethodCollector.m26664o(10689);
            return;
        }
        OutputStream outputStream = null;
        try {
            C3828a.C3831a b = aVar.mo9179b(str);
            OutputStream a = b.mo9186a();
            a.write(bArr);
            a.flush();
            if (b.f10591c) {
                C3828a.this.mo9178a(b, false);
                C3828a.this.mo9182c(b.f10589a.f10595a);
            } else {
                C3828a.this.mo9178a(b, true);
            }
            b.f10592d = true;
            try {
                a.close();
                MethodCollector.m26664o(10689);
            } catch (IOException unused) {
                MethodCollector.m26664o(10689);
            }
        } catch (Exception unused2) {
            if (0 != 0) {
                try {
                    outputStream.close();
                } catch (IOException unused3) {
                    MethodCollector.m26664o(10689);
                    return;
                }
            }
            MethodCollector.m26664o(10689);
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    outputStream.close();
                } catch (IOException unused4) {
                }
            }
            MethodCollector.m26664o(10689);
            throw th;
        }
    }
}
