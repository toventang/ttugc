package com.p2082ss.optimizer.live.sdk.dns;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.optimizer.live.sdk.dns.h */
public final class C86160h {

    /* renamed from: a */
    public final String f192142a;

    /* renamed from: b */
    public C86164k f192143b;

    /* renamed from: c */
    final List<String> f192144c = new ArrayList(10);

    /* renamed from: d */
    public final Map<String, C86162i> f192145d = new C0484a();

    /* renamed from: e */
    final List<String> f192146e = new ArrayList();

    /* renamed from: f */
    public String f192147f = null;

    /* renamed from: g */
    private final Random f192148g;

    /* renamed from: h */
    private C86164k f192149h;

    /* renamed from: i */
    private ReentrantLock f192150i = new ReentrantLock();

    static {
        Covode.recordClassIndex(101302);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List<String> mo136440b() {
        this.f192150i.lock();
        ArrayList arrayList = new ArrayList();
        C86164k kVar = this.f192143b;
        if (!(kVar == null || kVar.f192160b == null || this.f192143b.f192160b.isEmpty())) {
            arrayList.addAll(this.f192143b.f192160b);
        }
        this.f192150i.unlock();
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final List<String> mo136442c() {
        this.f192150i.lock();
        ArrayList arrayList = new ArrayList();
        C86164k kVar = this.f192149h;
        if (!(kVar == null || kVar.f192160b == null || this.f192149h.f192160b.isEmpty())) {
            arrayList.addAll(this.f192149h.f192160b);
        }
        this.f192150i.unlock();
        return arrayList;
    }

    /* renamed from: d */
    private boolean m147973d() {
        this.f192144c.clear();
        C86164k kVar = this.f192149h;
        if (kVar == null || this.f192143b == null) {
            return false;
        }
        if (kVar.f192160b.size() > 5) {
            this.f192144c.addAll(this.f192149h.f192160b.subList(0, 5));
        } else {
            this.f192144c.addAll(this.f192149h.f192160b);
        }
        ArrayList arrayList = new ArrayList(this.f192143b.f192160b);
        arrayList.removeAll(this.f192149h.f192160b);
        int size = 10 - this.f192144c.size();
        if (arrayList.size() >= size) {
            this.f192144c.addAll(arrayList.subList(0, size));
            return true;
        }
        this.f192144c.addAll(arrayList);
        int size2 = 10 - this.f192144c.size();
        if (this.f192149h.f192160b.size() - 5 > size2) {
            this.f192144c.addAll(this.f192149h.f192160b.subList(5, size2 + 5));
            return true;
        } else if (this.f192149h.f192160b.size() - 5 <= 0) {
            return true;
        } else {
            this.f192144c.addAll(this.f192149h.f192160b.subList(5, this.f192149h.f192160b.size()));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo136437a() {
        this.f192150i.lock();
        List<String> list = this.f192146e;
        if (list == null || list.isEmpty()) {
            C86164k kVar = this.f192149h;
            if (kVar == null || kVar.f192160b == null || this.f192149h.f192160b.isEmpty()) {
                C86164k kVar2 = this.f192143b;
                if (kVar2 == null || kVar2.f192160b == null || this.f192143b.f192160b.isEmpty()) {
                    this.f192150i.unlock();
                    return null;
                }
                String str = this.f192143b.f192160b.get(this.f192148g.nextInt(this.f192143b.f192160b.size()));
                this.f192150i.unlock();
                return str;
            }
            String str2 = this.f192149h.f192160b.get(0);
            this.f192150i.unlock();
            return str2;
        }
        List<String> list2 = this.f192146e;
        String str3 = list2.get(this.f192148g.nextInt(list2.size()));
        this.f192150i.unlock();
        return str3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo136438a(String str) {
        C86164k kVar = this.f192149h;
        if (kVar == null || kVar.f192160b == null) {
            return null;
        }
        if (this.f192149h.f192160b.contains(str)) {
            return this.f192147f;
        }
        return "local_dns";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo136441b(C86164k kVar) {
        this.f192150i.lock();
        this.f192143b = kVar;
        this.f192150i.unlock();
        return m147973d();
    }

    C86160h(String str) {
        this.f192142a = str;
        this.f192148g = new Random(System.currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo136439a(C86164k kVar) {
        this.f192150i.lock();
        this.f192149h = kVar;
        this.f192150i.unlock();
        return m147973d();
    }
}
