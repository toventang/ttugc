package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Xml;
import com.bytedance.covode.number.Covode;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.c */
public class C0418c extends DataSetObservable {

    /* renamed from: a */
    static final String f1634a = C0418c.class.getSimpleName();

    /* renamed from: g */
    private static final Object f1635g = new Object();

    /* renamed from: h */
    private static final Map<String, C0418c> f1636h = new HashMap();

    /* renamed from: b */
    final Object f1637b;

    /* renamed from: c */
    final List<C0419a> f1638c;

    /* renamed from: d */
    final Context f1639d;

    /* renamed from: e */
    final String f1640e;

    /* renamed from: f */
    boolean f1641f;

    /* renamed from: i */
    private final List<C0421c> f1642i;

    /* renamed from: j */
    private Intent f1643j;

    /* renamed from: k */
    private AbstractC0420b f1644k;

    /* renamed from: l */
    private int f1645l;

    /* renamed from: m */
    private boolean f1646m;

    /* renamed from: n */
    private boolean f1647n;

    /* renamed from: o */
    private boolean f1648o;

    /* renamed from: p */
    private AbstractC0422d f1649p;

    /* renamed from: androidx.appcompat.widget.c$b */
    public interface AbstractC0420b {
        static {
            Covode.recordClassIndex(485);
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    public interface AbstractC0422d {
        static {
            Covode.recordClassIndex(487);
        }

        /* renamed from: a */
        boolean mo1900a();
    }

    /* renamed from: androidx.appcompat.widget.c$a */
    public static final class C0419a implements Comparable<C0419a> {

        /* renamed from: a */
        public final ResolveInfo f1650a;

        /* renamed from: b */
        public float f1651b;

        static {
            Covode.recordClassIndex(484);
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f1651b) + 31;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("resolveInfo:").append(this.f1650a.toString());
            sb.append("; weight:").append(new BigDecimal((double) this.f1651b));
            sb.append("]");
            return sb.toString();
        }

        public C0419a(ResolveInfo resolveInfo) {
            this.f1650a = resolveInfo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(C0419a aVar) {
            return Float.floatToIntBits(aVar.f1651b) - Float.floatToIntBits(this.f1651b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass() && Float.floatToIntBits(this.f1651b) == Float.floatToIntBits(((C0419a) obj).f1651b)) {
                return true;
            }
            return false;
        }
    }

    static {
        Covode.recordClassIndex(483);
    }

    /* renamed from: g */
    private boolean m1546g() {
        if (!this.f1641f || !this.f1647n || TextUtils.isEmpty(this.f1640e)) {
            return false;
        }
        this.f1641f = false;
        this.f1646m = true;
        m1548i();
        return true;
    }

    /* renamed from: h */
    private void m1547h() {
        int size = this.f1642i.size() - this.f1645l;
        if (size > 0) {
            this.f1647n = true;
            int i = 0;
            do {
                this.f1642i.remove(0);
                i++;
            } while (i < size);
        }
    }

    /* renamed from: a */
    public final int mo1886a() {
        int size;
        synchronized (this.f1637b) {
            mo1892c();
            size = this.f1638c.size();
        }
        return size;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo1892c() {
        boolean f = m1545f() | m1546g();
        m1547h();
        if (f) {
            m1544e();
            notifyChanged();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    public static final class C0421c {

        /* renamed from: a */
        public final ComponentName f1652a;

        /* renamed from: b */
        public final long f1653b;

        /* renamed from: c */
        public final float f1654c;

        static {
            Covode.recordClassIndex(486);
        }

        public final int hashCode() {
            int hashCode;
            ComponentName componentName = this.f1652a;
            if (componentName == null) {
                hashCode = 0;
            } else {
                hashCode = componentName.hashCode();
            }
            long j = this.f1653b;
            return ((((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.f1654c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("; activity:").append(this.f1652a);
            sb.append("; time:").append(this.f1653b);
            sb.append("; weight:").append(new BigDecimal((double) this.f1654c));
            sb.append("]");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0421c cVar = (C0421c) obj;
            ComponentName componentName = this.f1652a;
            if (componentName == null) {
                if (cVar.f1652a != null) {
                    return false;
                }
            } else if (!componentName.equals(cVar.f1652a)) {
                return false;
            }
            if (this.f1653b == cVar.f1653b && Float.floatToIntBits(this.f1654c) == Float.floatToIntBits(cVar.f1654c)) {
                return true;
            }
            return false;
        }

        public C0421c(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public C0421c(ComponentName componentName, long j, float f) {
            this.f1652a = componentName;
            this.f1653b = j;
            this.f1654c = f;
        }
    }

    /* renamed from: d */
    private void m1543d() {
        if (!this.f1646m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f1647n) {
            this.f1647n = false;
            if (!TextUtils.isEmpty(this.f1640e)) {
                new AsyncTaskC0423e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f1642i), this.f1640e);
            }
        }
    }

    /* renamed from: e */
    private boolean m1544e() {
        if (this.f1644k == null || this.f1643j == null || this.f1638c.isEmpty() || this.f1642i.isEmpty()) {
            return false;
        }
        Collections.unmodifiableList(this.f1642i);
        return true;
    }

    /* renamed from: f */
    private boolean m1545f() {
        if (!this.f1648o || this.f1643j == null) {
            return false;
        }
        this.f1648o = false;
        this.f1638c.clear();
        List<ResolveInfo> queryIntentActivities = this.f1639d.getPackageManager().queryIntentActivities(this.f1643j, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f1638c.add(new C0419a(queryIntentActivities.get(i)));
        }
        return true;
    }

    /* renamed from: b */
    public final ResolveInfo mo1891b() {
        synchronized (this.f1637b) {
            mo1892c();
            if (this.f1638c.isEmpty()) {
                return null;
            }
            return this.f1638c.get(0).f1650a;
        }
    }

    /* renamed from: i */
    private void m1548i() {
        try {
            FileInputStream openFileInput = this.f1639d.openFileInput(this.f1640e);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                while (true) {
                    int next = newPullParser.next();
                    if (next == 1 || next == 2) {
                    }
                }
                if ("historical-records".equals(newPullParser.getName())) {
                    List<C0421c> list = this.f1642i;
                    list.clear();
                    while (true) {
                        int next2 = newPullParser.next();
                        if (next2 != 1) {
                            if (!(next2 == 3 || next2 == 4)) {
                                if ("historical-record".equals(newPullParser.getName())) {
                                    list.add(new C0421c(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                                } else {
                                    throw new XmlPullParserException("Share records file not well-formed.");
                                }
                            }
                        } else if (openFileInput != null) {
                            try {
                                openFileInput.close();
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
            } catch (XmlPullParserException unused2) {
                if (openFileInput != null) {
                    openFileInput.close();
                }
            } catch (IOException unused3) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused4) {
                    }
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused6) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.c$e */
    public final class AsyncTaskC0423e extends AsyncTask<Object, Void, Void> {
        static {
            Covode.recordClassIndex(488);
        }

        AsyncTaskC0423e() {
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x006b, code lost:
            if (r5 != null) goto L_0x008d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
            if (r5 == null) goto L_0x0090;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
            if (r5 == null) goto L_0x0090;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
            if (r5 == null) goto L_0x0090;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
            r5.close();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Object... r15) {
            /*
            // Method dump skipped, instructions count: 145
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0418c.AsyncTaskC0423e.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    /* renamed from: a */
    public final int mo1887a(ResolveInfo resolveInfo) {
        synchronized (this.f1637b) {
            mo1892c();
            List<C0419a> list = this.f1638c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).f1650a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public final ResolveInfo mo1888a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f1637b) {
            mo1892c();
            resolveInfo = this.f1638c.get(i).f1650a;
        }
        return resolveInfo;
    }

    /* renamed from: b */
    public final Intent mo1890b(int i) {
        synchronized (this.f1637b) {
            if (this.f1643j == null) {
                return null;
            }
            mo1892c();
            C0419a aVar = this.f1638c.get(i);
            ComponentName componentName = new ComponentName(aVar.f1650a.activityInfo.packageName, aVar.f1650a.activityInfo.name);
            Intent intent = new Intent(this.f1643j);
            intent.setComponent(componentName);
            if (this.f1649p != null) {
                new Intent(intent);
                if (this.f1649p.mo1900a()) {
                    return null;
                }
            }
            mo1889a(new C0421c(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo1889a(C0421c cVar) {
        boolean add = this.f1642i.add(cVar);
        if (add) {
            this.f1647n = true;
            m1547h();
            m1543d();
            m1544e();
            notifyChanged();
        }
        return add;
    }
}
