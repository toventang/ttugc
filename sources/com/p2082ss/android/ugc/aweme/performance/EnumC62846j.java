package com.p2082ss.android.ugc.aweme.performance;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.p022b.p023a.C0464a;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88790v;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: com.ss.android.ugc.aweme.performance.j */
public enum EnumC62846j {
    INSTANCE;
    
    public C0464a asyncLayoutInflater = new C0464a(C17867d.m33078a());
    public ConcurrentHashMap<Integer, LinkedList<View>> storage = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(73672);
    }

    public final void setContext(Context context) {
        this.asyncLayoutInflater = new C0464a(context);
    }

    private EnumC62846j(String str) {
    }

    public final void recycle(int i, View view) {
        LinkedList<View> linkedList = this.storage.get(Integer.valueOf(i));
        if (linkedList != null) {
            linkedList.add(view);
        }
    }

    public final AbstractC88979t<View> preInflate(final int i, final ViewGroup viewGroup) {
        LinkedList<View> linkedList = this.storage.get(Integer.valueOf(i));
        if (linkedList == null || linkedList.isEmpty()) {
            return AbstractC88979t.m154294a(new AbstractC88983w<View>() {
                /* class com.p2082ss.android.ugc.aweme.performance.EnumC62846j.C628471 */

                static {
                    Covode.recordClassIndex(73673);
                }

                @Override // p4560f.p4561a.AbstractC88983w
                public final void subscribe(final AbstractC88982v<View> vVar) {
                    EnumC62846j.this.asyncLayoutInflater.mo2025a(i, viewGroup, new C0464a.AbstractC0469d() {
                        /* class com.p2082ss.android.ugc.aweme.performance.EnumC62846j.C628471.C628481 */

                        static {
                            Covode.recordClassIndex(73674);
                        }

                        @Override // androidx.p022b.p023a.C0464a.AbstractC0469d
                        public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
                            vVar.mo143031a(view);
                            LinkedList<View> linkedList = EnumC62846j.this.storage.get(Integer.valueOf(i));
                            if (linkedList == null) {
                                linkedList = new LinkedList<>();
                                EnumC62846j.this.storage.put(Integer.valueOf(i), linkedList);
                            }
                            linkedList.add(view);
                        }
                    });
                }
            });
        }
        return C88925a.m154171a(C88790v.f201616a);
    }

    public final View inflate(Context context, int i, ViewGroup viewGroup) {
        return inflate(LayoutInflater.from(context), context, i, viewGroup);
    }

    public final View inflate(LayoutInflater layoutInflater, Context context, int i, ViewGroup viewGroup) {
        LinkedList<View> linkedList = this.storage.get(Integer.valueOf(i));
        if (linkedList == null || linkedList.isEmpty()) {
            return C1764a.m5927a(layoutInflater, i, viewGroup, false);
        }
        View poll = linkedList.poll();
        Context context2 = poll.getContext();
        if (context2 instanceof MutableContextWrapper) {
            ((MutableContextWrapper) context2).setBaseContext(context);
        }
        return poll;
    }
}
