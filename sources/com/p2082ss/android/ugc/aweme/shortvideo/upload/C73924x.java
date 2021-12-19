package com.p2082ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.x */
public final class C73924x {

    /* renamed from: a */
    public static final C73924x f165970a = new C73924x();

    /* renamed from: b */
    private ConcurrentLinkedQueue<String> f165971b = new ConcurrentLinkedQueue<>();

    static {
        Covode.recordClassIndex(86671);
    }

    /* renamed from: a */
    public final ArrayList<String> mo116371a() {
        this.f165971b.offer(System.currentTimeMillis() + ":report");
        ArrayList<String> arrayList = new ArrayList<>(this.f165971b);
        this.f165971b.clear();
        return arrayList;
    }

    /* renamed from: a */
    public final void mo116372a(String str) {
        if (this.f165971b.size() >= 30) {
            this.f165971b.poll();
        }
        this.f165971b.offer(System.currentTimeMillis() + ":" + str);
    }
}
