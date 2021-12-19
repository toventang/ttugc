package com.google.android.play.core.p1966e.p1968b;

import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.C26958r;
import com.google.android.play.core.p1966e.AbstractC27034f;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.e.b.d */
final /* synthetic */ class RunnableC27021d implements Runnable {

    /* renamed from: a */
    private final C27018a f63958a;

    /* renamed from: b */
    private final List f63959b;

    /* renamed from: c */
    private final List f63960c;

    static {
        Covode.recordClassIndex(32497);
    }

    RunnableC27021d(C27018a aVar, List list, List list2) {
        this.f63958a = aVar;
        this.f63959b = list;
        this.f63960c = list2;
    }

    public final void run() {
        C27018a aVar = this.f63958a;
        List<File> list = this.f63959b;
        List list2 = this.f63960c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (File file : list) {
            String a = C26958r.m53561a(file);
            Uri fromFile = Uri.fromFile(file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(fromFile, aVar.f63937b.getContentResolver().getType(fromFile));
            intent.addFlags(1);
            intent.putExtra("module_name", C27018a.m53686a(a));
            intent.putExtra("split_id", a);
            arrayList.add(intent);
            arrayList2.add(C27018a.m53686a(C26958r.m53561a(file)));
        }
        AbstractC27034f c = aVar.mo44724c();
        if (c != null) {
            aVar.f63939d.execute(new RunnableC27025h(aVar, c.mo44738e(), arrayList, arrayList2, list2));
        }
    }
}
