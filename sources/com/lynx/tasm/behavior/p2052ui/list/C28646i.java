package com.lynx.tasm.behavior.p2052ui.list;

import android.view.ViewGroup;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.C28781g;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.list.C28644h;
import com.lynx.tasm.behavior.p2052ui.view.C28698a;
import com.lynx.tasm.behavior.p2052ui.view.UIComponent;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.ui.list.i */
public class C28646i extends RecyclerView.AbstractC1350a<C28644h> {

    /* renamed from: a */
    final HashMap<String, Integer> f67454a = new HashMap<>();

    /* renamed from: b */
    final HashMap<Long, C28644h> f67455b = new HashMap<>();

    /* renamed from: c */
    final UIList f67456c;

    /* renamed from: d */
    boolean f67457d;

    /* renamed from: e */
    boolean f67458e;

    /* renamed from: f */
    JavaOnlyArray f67459f;

    /* renamed from: g */
    JavaOnlyArray f67460g;

    /* renamed from: h */
    JavaOnlyArray f67461h;

    /* renamed from: i */
    JavaOnlyArray f67462i;

    /* renamed from: j */
    JavaOnlyArray f67463j;

    /* renamed from: k */
    final C28647a f67464k = new C28647a(this, (byte) 0);

    /* renamed from: l */
    boolean f67465l;

    /* renamed from: m */
    private int f67466m;

    /* renamed from: n */
    private final C28626a f67467n;

    static {
        Covode.recordClassIndex(34705);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ C28644h onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m57288a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        return this.f67459f.size();
    }

    /* renamed from: a */
    private long m57287a() {
        int i = this.f67466m;
        this.f67466m = i + 1;
        return (((long) this.f67456c.getSign()) << 32) + ((long) i);
    }

    /* renamed from: com.lynx.tasm.behavior.ui.list.i$a */
    final class C28647a {

        /* renamed from: a */
        ReadableArray f67468a;

        /* renamed from: b */
        ReadableArray f67469b;

        /* renamed from: c */
        ReadableArray f67470c;

        /* renamed from: d */
        ReadableArray f67471d;

        /* renamed from: e */
        ReadableArray f67472e;

        /* renamed from: f */
        ReadableArray f67473f;

        static {
            Covode.recordClassIndex(34706);
        }

        private C28647a() {
        }

        /* synthetic */ C28647a(C28646i iVar, byte b) {
            this();
        }
    }

    /* renamed from: a */
    private void m57289a(C28644h hVar) {
        UIComponent uIComponent = hVar.f67449a.f67451b;
        if (uIComponent != null) {
            hVar.mo49586a();
            this.f67456c.mo49529b(uIComponent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo49593b(int i) {
        return this.f67461h.contains(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo49594c(int i) {
        return this.f67462i.contains(Integer.valueOf(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public long getItemId(int i) {
        if (this.mHasStableIds) {
            return (long) i;
        }
        return -1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ void onViewDetachedFromWindow(C28644h hVar) {
        C28644h hVar2 = hVar;
        this.f67467n.mo49560b(hVar2);
        if (this.f67457d) {
            m57289a(hVar2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemViewType(int i) {
        Integer num = this.f67454a.get(this.f67459f.getString(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ void onViewAttachedToWindow(C28644h hVar) {
        C28644h hVar2 = hVar;
        if (this.f67457d && hVar2.f67449a.f67451b == null) {
            mo49591a(hVar2, hVar2.getAdapterPosition());
        }
        this.f67467n.mo49559a(hVar2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo49592a(int i) {
        return this.f67460g.contains(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo49595d(int i) {
        for (int size = this.f67460g.size() - 1; size >= 0; size--) {
            Integer num = (Integer) this.f67460g.get(size);
            if (num.intValue() <= i) {
                return num.intValue();
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo49596e(int i) {
        for (int i2 = 0; i2 < this.f67460g.size(); i2++) {
            Integer num = (Integer) this.f67460g.get(i2);
            if (num.intValue() >= i) {
                return num.intValue();
            }
        }
        return -1;
    }

    public C28646i(UIList uIList, C28626a aVar) {
        this.f67456c = uIList;
        this.f67467n = aVar;
    }

    /* renamed from: c */
    private void m57291c(C28644h hVar, int i) {
        if (this.f67465l) {
            StaggeredGridLayoutManager.C1385b bVar = new StaggeredGridLayoutManager.C1385b(hVar.itemView.getLayoutParams());
            bVar.f4602b = mo49592a(i);
            hVar.itemView.setLayoutParams(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49591a(C28644h hVar, int i) {
        MethodCollector.m26663i(2653);
        long a = m57287a();
        this.f67455b.put(Long.valueOf(a), hVar);
        UIComponent uIComponent = (UIComponent) this.f67456c.mo49526a(i, a);
        if (uIComponent == null || C0792v.m2791y(uIComponent.mView)) {
            this.f67455b.remove(Long.valueOf(a));
            MethodCollector.m26664o(2653);
            return;
        }
        if (uIComponent != hVar.f67449a.f67451b) {
            if (((C28698a) uIComponent.mView).getParent() != null) {
                ((ViewGroup) ((C28698a) uIComponent.mView).getParent()).removeView(uIComponent.mView);
            }
            m57289a(hVar);
            hVar.mo49588a(uIComponent);
            this.f67467n.mo49561c(hVar);
        }
        m57291c(hVar, i);
        JavaOnlyArray javaOnlyArray = this.f67463j;
        if (javaOnlyArray != null && javaOnlyArray.size() > i) {
            hVar.mo49587a(((Integer) this.f67463j.get(i)).intValue());
        }
        MethodCollector.m26664o(2653);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m57288a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(2849);
        if (UIList.f67360h) {
            LLog.m56856a(4, "UIList", "Adapter onCreateViewHolder ".concat(String.valueOf(i)));
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        C28644h.C28645a aVar = new C28644h.C28645a(viewGroup.getContext());
        aVar.setLayoutParams(layoutParams);
        C28644h hVar = new C28644h(aVar);
        try {
            if (hVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(hVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) hVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(hVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = hVar.getClass().getName();
        MethodCollector.m26664o(2849);
        return hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void onBindViewHolder(C28644h hVar, int i) {
        MethodCollector.m26663i(2633);
        if (UIList.f67360h) {
            LLog.m56856a(4, "UIList", "Adapter onBindViewHolder ".concat(String.valueOf(i)));
        }
        if (this.f67457d) {
            mo49591a(hVar, i);
            MethodCollector.m26664o(2633);
            return;
        }
        long a = m57287a();
        this.f67455b.put(Long.valueOf(a), hVar);
        if (hVar.f67449a.f67451b == null) {
            UIList uIList = this.f67456c;
            C28781g gVar = uIList.f67353a;
            int sign = uIList.getSign();
            if (gVar.f67869a != null) {
                TemplateAssembler templateAssembler = gVar.f67869a;
                if (templateAssembler.f66692g) {
                    LLog.m56856a(6, "TemplateAssembler", "renderChild: listSign " + sign + ", index " + i);
                } else {
                    templateAssembler.nativeRenderChild(templateAssembler.f66686a, sign, i, a);
                }
            }
            uIList.f67354b = null;
            UIComponent uIComponent = (UIComponent) ((LynxUI) uIList.f67354b);
            if (uIComponent != null) {
                hVar.mo49588a(uIComponent);
            }
            this.f67467n.mo49561c(hVar);
        } else {
            hVar.f67449a.f67450a = 1;
            this.f67456c.mo49528a(hVar.f67449a.f67451b, i, a);
        }
        m57291c(hVar, i);
        JavaOnlyArray javaOnlyArray = this.f67463j;
        if (javaOnlyArray != null && javaOnlyArray.size() > i) {
            hVar.mo49587a(((Integer) this.f67463j.get(i)).intValue());
        }
        MethodCollector.m26664o(2633);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ void onBindViewHolder(C28644h hVar, int i, List list) {
        C28644h hVar2 = hVar;
        if (this.f67457d) {
            if (!list.isEmpty()) {
                i = ((Integer) list.get(list.size() - 1)).intValue();
            }
            mo49591a(hVar2, Integer.valueOf(i).intValue());
        } else if (list.isEmpty()) {
            onBindViewHolder(hVar2, i);
        } else {
            long a = m57287a();
            Integer num = (Integer) list.get(list.size() - 1);
            this.f67455b.put(Long.valueOf(a), hVar2);
            this.f67467n.mo49560b(hVar2);
            hVar2.f67449a.f67450a = 1;
            this.f67456c.mo49528a(hVar2.f67449a.f67451b, num.intValue(), a);
            this.f67467n.mo49559a(hVar2);
            m57291c(hVar2, num.intValue());
            JavaOnlyArray javaOnlyArray = this.f67463j;
            if (javaOnlyArray != null && javaOnlyArray.size() > i) {
                hVar2.mo49587a(((Integer) this.f67463j.get(i)).intValue());
            }
        }
    }
}
