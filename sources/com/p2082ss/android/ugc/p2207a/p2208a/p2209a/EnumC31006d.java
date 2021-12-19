package com.p2082ss.android.ugc.p2207a.p2208a.p2209a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p2207a.p2208a.p2210b.C31008a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.a.a.a.d */
public enum EnumC31006d {
    INSTANCE;
    
    public HashMap<String, C31008a> idToPresenter = new HashMap<>();
    public HashMap<C31008a, String> presenterToId = new HashMap<>();

    public final void clear() {
        this.idToPresenter.clear();
        this.presenterToId.clear();
    }

    static {
        Covode.recordClassIndex(37634);
    }

    public final <P> P getPresenter(String str) {
        return (P) this.idToPresenter.get(str);
    }

    public final String getId(C31008a aVar) {
        return this.presenterToId.get(aVar);
    }

    private EnumC31006d(String str) {
    }

    public final void add(final C31008a aVar) {
        String str = aVar.getClass().getSimpleName() + "/" + System.nanoTime() + "/" + ((int) (Math.random() * 2.147483647E9d));
        this.idToPresenter.put(str, aVar);
        this.presenterToId.put(aVar, str);
        aVar.f74329b.add(new C31008a.AbstractC31009a() {
            /* class com.p2082ss.android.ugc.p2207a.p2208a.p2209a.EnumC31006d.C310071 */

            static {
                Covode.recordClassIndex(37635);
            }

            @Override // com.p2082ss.android.ugc.p2207a.p2208a.p2210b.C31008a.AbstractC31009a
            /* renamed from: a */
            public final void mo56092a() {
                EnumC31006d.this.idToPresenter.remove(EnumC31006d.this.presenterToId.remove(aVar));
            }
        });
    }
}
