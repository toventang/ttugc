package com.bytedance.covode.number;

import com.bytedance.covode.number.Covode;
import com.bytedance.covode.p922a.C13801a;
import com.bytedance.covode.p922a.C13802b;
import com.bytedance.covode.p922a.C13804c;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

/* access modifiers changed from: package-private */
public class CovodeNumberImpl extends Covode {

    /* renamed from: a */
    static CovodeNumberImpl f33571a = new CovodeNumberImpl();

    /* renamed from: c */
    public static C13809a f33572c = new C13809a();

    /* renamed from: b */
    public Covode.C13805a f33573b;

    static native void initRecorder(String str, int i, boolean z);

    /* access modifiers changed from: package-private */
    public native void clearBitmap();

    /* access modifiers changed from: package-private */
    public native void recordClassIndexToFile(int i);

    CovodeNumberImpl() {
    }

    /* renamed from: a */
    private static boolean m24920a() {
        if (MaxIndexGetter.getMaxIndex() == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.covode.number.Covode
    public synchronized boolean report(Covode.AbstractC13806b bVar) {
        if (!m24920a()) {
            return false;
        }
        Covode.C13805a aVar = this.f33573b;
        if (aVar == null) {
            return false;
        }
        C13801a aVar2 = aVar.f33569a;
        if (!aVar2.f33566c) {
            return false;
        }
        if (C13802b.m24912a(aVar2) == null) {
            C13804c.m24916a("tag_dex_read");
            return false;
        }
        File a = C13802b.m24913a(new C13802b.AbstractC13803a() {
            /* class com.bytedance.covode.number.CovodeNumberImpl.C138082 */

            @Override // com.bytedance.covode.p922a.C13802b.AbstractC13803a
            /* renamed from: a */
            public final void mo22208a() {
                CovodeNumberImpl.this.clearBitmap();
            }
        });
        if (a == null) {
            return false;
        }
        C13804c.f33568a.put("tag_upload", Long.valueOf(System.currentTimeMillis()));
        boolean a2 = bVar.mo22213a(a);
        C13804c.m24916a("tag_upload");
        return a2;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.covode.number.Covode
    public synchronized boolean start(Covode.C13805a aVar) {
        if (!m24920a()) {
            return false;
        }
        if (!aVar.f33570b) {
            this.f33573b = aVar;
            f33572c.f33576a.clear();
            f33572c.f33577b.clear();
            return false;
        }
        C13801a aVar2 = aVar.f33569a;
        File a = C13802b.m24912a(aVar2);
        if (a == null) {
            C13804c.m24916a("tag_dex_read");
            return false;
        }
        try {
            System.loadLibrary("covode_number");
            initRecorder(new File(a, "record").getPath(), MaxIndexGetter.getMaxIndex(), aVar2.f33566c);
            this.f33573b = aVar;
            C40787l.C40788a a2 = C40787l.m82269a(EnumC40793o.FIXED);
            a2.f95505c = 1;
            C40780g.m82242a(a2.mo70028a()).execute(new Runnable() {
                /* class com.bytedance.covode.number.CovodeNumberImpl.RunnableC138071 */

                public final void run() {
                    if (CovodeNumberImpl.f33572c != null) {
                        LinkedBlockingQueue<Integer> linkedBlockingQueue = CovodeNumberImpl.f33572c.f33576a;
                        LinkedBlockingQueue<Short> linkedBlockingQueue2 = CovodeNumberImpl.f33572c.f33577b;
                        if (linkedBlockingQueue != null) {
                            if (CovodeNumberImpl.this.f33573b.f33570b) {
                                linkedBlockingQueue.size();
                                Iterator<Integer> it = linkedBlockingQueue.iterator();
                                while (it.hasNext()) {
                                    CovodeNumberImpl.this.recordClassIndexToFile(it.next().intValue());
                                }
                            }
                            linkedBlockingQueue.clear();
                        }
                        if (linkedBlockingQueue2 != null) {
                            if (CovodeNumberImpl.this.f33573b.f33570b) {
                                linkedBlockingQueue2.size();
                                Iterator<Short> it2 = linkedBlockingQueue2.iterator();
                                while (it2.hasNext()) {
                                    CovodeNumberImpl.this.recordClassIndexToFile(it2.next().shortValue());
                                }
                            }
                            linkedBlockingQueue2.clear();
                        }
                        CovodeNumberImpl.f33572c = null;
                    }
                }
            });
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
        return true;
    }
}
