package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56222f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.e */
public final /* synthetic */ class RunnableC54543e implements Runnable {

    /* renamed from: a */
    private final C54542d f125014a;

    /* renamed from: b */
    private final RecyclerView f125015b;

    static {
        Covode.recordClassIndex(64254);
    }

    RunnableC54543e(C54542d dVar, RecyclerView recyclerView) {
        this.f125014a = dVar;
        this.f125015b = recyclerView;
    }

    public final void run() {
        C54542d dVar = this.f125014a;
        RecyclerView recyclerView = this.f125015b;
        if (recyclerView.getAdapter() != null && !dVar.f125005a.isEmpty()) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int k = linearLayoutManager.mo4371k();
            int m = linearLayoutManager.mo4373m();
            for (int i = k; i <= m; i++) {
                if (dVar.f125005a.get(Integer.valueOf(i)) != null) {
                    dVar.f125005a.get(Integer.valueOf(i));
                }
            }
            if (recyclerView.getAdapter().getItemCount() >= m && k != -1) {
                try {
                    int[] iArr = new int[2];
                    recyclerView.getLocationOnScreen(iArr);
                    String str = "";
                    while (k <= m) {
                        int itemViewType = recyclerView.getAdapter().getItemViewType(k);
                        if (itemViewType == EnumC53772b.SHARE_AWEME_RECEIVE.getViewType() || itemViewType == EnumC53772b.SHARE_AWEME_SEND.getViewType()) {
                            RecyclerView.ViewHolder f = recyclerView.mo4451f(k);
                            if (f instanceof C54565s) {
                                C19538ai aiVar = ((C54565s) f).f124823s;
                                C54542d f2 = C54542d.m100005f();
                                String uuid = aiVar.getUuid();
                                AbstractC56222f fVar = f2.f125006b.get(f2.f125007c);
                                if (TextUtils.equals(f2.f125007c, uuid) && fVar != null && fVar.mo92000b()) {
                                    if (f != null) {
                                        View view = f.itemView;
                                        int[] iArr2 = new int[2];
                                        view.getLocationOnScreen(iArr2);
                                        Rect rect = new Rect();
                                        rect.set(iArr2[0], iArr2[1], iArr2[0] + view.getWidth(), iArr2[1] + view.getHeight());
                                        int i2 = (rect.top + rect.bottom) / 2;
                                        if (i2 < recyclerView.getTop() + iArr[1] || i2 > iArr[1] + recyclerView.getBottom()) {
                                            C54542d f3 = C54542d.m100005f();
                                            AbstractC56222f fVar2 = f3.f125006b.get(f3.f125007c);
                                            if (fVar2 != null && !TextUtils.isEmpty(f3.f125007c) && fVar2.mo92000b()) {
                                                fVar2.mo92002d();
                                            }
                                        }
                                    }
                                    str = aiVar.getUuid();
                                }
                            }
                        }
                        k++;
                    }
                    if (str.equals(dVar.f125007c) && dVar.f125005a.get(str) != null) {
                        dVar.f125005a.get(str);
                    }
                    if (dVar.f125005a.get(dVar.f125007c) != null) {
                        dVar.f125005a.get(dVar.f125007c);
                    }
                    if (dVar.f125005a.get(str) != null) {
                        dVar.f125005a.get(str);
                        dVar.mo91632b(str);
                    }
                    dVar.f125008d = false;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
