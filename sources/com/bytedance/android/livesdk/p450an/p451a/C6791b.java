package com.bytedance.android.livesdk.p450an.p451a;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.p230a.C4054a;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.uikit.textview.AlwaysMarqueeTextView;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.an.a.b */
public final class C6791b extends AbstractC11293v {

    /* renamed from: c */
    public static C27910f f16845c;

    /* renamed from: d */
    public static C6805b<?> f16846d;

    /* renamed from: e */
    public static final C6792a f16847e = new C6792a((byte) 0);

    /* renamed from: a */
    public AbstractC6796c f16848a;

    /* renamed from: b */
    public LiveEditText f16849b;

    /* renamed from: f */
    private LiveButton f16850f;

    /* renamed from: g */
    private HashMap f16851g;

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f16851g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f16851g == null) {
            this.f16851g = new HashMap();
        }
        View view = (View) this.f16851g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f16851g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.livesdk.an.a.b$a */
    public static final class C6792a {
        static {
            Covode.recordClassIndex(7530);
        }

        private C6792a() {
        }

        public /* synthetic */ C6792a(byte b) {
            this();
        }

        /* renamed from: com.bytedance.android.livesdk.an.a.b$a$a */
        public static final class C6793a implements AbstractC6796c {

            /* renamed from: a */
            final /* synthetic */ C6805b f16852a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89171a f16853b;

            /* renamed from: c */
            final /* synthetic */ C6791b f16854c;

            static {
                Covode.recordClassIndex(7531);
            }

            @Override // com.bytedance.android.livesdk.p450an.p451a.AbstractC6796c
            /* renamed from: a */
            public final void mo13060a(Editable editable) {
                String str;
                Throwable th;
                if (editable == null || (str = editable.toString()) == null) {
                    str = "";
                }
                try {
                    Object a = this.f16852a.mo13066a();
                    if (a instanceof Integer) {
                        C6806c.m14603a(this.f16852a, Integer.valueOf(Integer.parseInt(str)));
                    } else if (a instanceof Double) {
                        C6806c.m14603a(this.f16852a, Double.valueOf(Double.parseDouble(str)));
                    } else if (a instanceof Float) {
                        C6806c.m14603a(this.f16852a, Float.valueOf(Float.parseFloat(str)));
                    } else if (a instanceof Long) {
                        C6806c.m14603a(this.f16852a, Long.valueOf(Long.parseLong(str)));
                    } else if (a instanceof Byte) {
                        C6806c.m14603a(this.f16852a, Byte.valueOf(Byte.parseByte(str)));
                    } else if (a instanceof Character) {
                        C6806c.m14603a(this.f16852a, Character.valueOf(str.charAt(0)));
                    } else if (a instanceof Short) {
                        C6806c.m14603a(this.f16852a, Short.valueOf(Short.parseShort(str)));
                    } else if (a instanceof Boolean) {
                        C6806c.m14603a(this.f16852a, Boolean.valueOf(Boolean.parseBoolean(str)));
                    } else if (a instanceof String) {
                        C6806c.m14603a(this.f16852a, str);
                    } else {
                        C6805b<?> bVar = C6791b.f16846d;
                        if (bVar != null) {
                            Object a2 = C6791b.f16845c.mo46670a(str, (Class) bVar.mo13066a().getClass());
                            C89219l.m154716b(a2, "");
                            C6806c.m14603a(this.f16852a, a2);
                        }
                    }
                    C11226ao.m19883a(C3966y.m9669e(), "save success!!", 0);
                    this.f16853b.invoke();
                } catch (Exception unused) {
                    C11226ao.m19883a(C3966y.m9669e(), "save error, because your value is not right!", 0);
                } catch (Throwable th2) {
                    th = th2;
                }
                this.f16854c.mo9929d();
                this.f16854c.dismiss();
                return;
                this.f16854c.mo9929d();
                this.f16854c.dismiss();
                throw th;
            }

            C6793a(C6805b bVar, AbstractC89171a aVar, C6791b bVar2) {
                this.f16852a = bVar;
                this.f16853b = aVar;
                this.f16854c = bVar2;
            }
        }
    }

    /* renamed from: d */
    public final void mo9929d() {
        LiveEditText liveEditText = this.f16849b;
        if (liveEditText != null) {
            C11279p.m20016b((EditText) liveEditText);
        }
    }

    /* renamed from: e */
    public final void mo13059e() {
        LiveButton liveButton = this.f16850f;
        if (liveButton != null) {
            liveButton.setOnClickListener(new View$OnClickListenerC6795c(this));
        }
    }

    static {
        Covode.recordClassIndex(7529);
        C27910f fVar = C4139e.C4140a.f11575b;
        C89219l.m154716b(fVar, "");
        f16845c = fVar;
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.bab);
        bVar.f27025l = 48;
        bVar.f27020g = 17;
        bVar.f27021h = -1;
        bVar.f27022i = -2;
        return bVar;
    }

    /* renamed from: com.bytedance.android.livesdk.an.a.b$b */
    static final class View$OnClickListenerC6794b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6791b f16855a;

        static {
            Covode.recordClassIndex(7532);
        }

        View$OnClickListenerC6794b(C6791b bVar) {
            this.f16855a = bVar;
        }

        public final void onClick(View view) {
            this.f16855a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.an.a.b$c */
    public static final class View$OnClickListenerC6795c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6791b f16856a;

        static {
            Covode.recordClassIndex(7533);
        }

        View$OnClickListenerC6795c(C6791b bVar) {
            this.f16856a = bVar;
        }

        public final void onClick(View view) {
            Editable editable;
            LiveEditText liveEditText = this.f16856a.f16849b;
            if (liveEditText != null) {
                editable = liveEditText.getText();
            } else {
                editable = null;
            }
            AbstractC6796c cVar = this.f16856a.f16848a;
            if (cVar != null) {
                cVar.mo13060a(editable);
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(C4054a.m9853a(getActivity()));
        C89219l.m154716b(cloneInContext, "");
        return cloneInContext;
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Class<?> cls;
        String str;
        Object a;
        String str2 = "";
        C89219l.m154721d(view, str2);
        super.onViewCreated(view, bundle);
        AlwaysMarqueeTextView alwaysMarqueeTextView = (AlwaysMarqueeTextView) view.findViewById(R.id.exw);
        AlwaysMarqueeTextView alwaysMarqueeTextView2 = (AlwaysMarqueeTextView) view.findViewById(R.id.f6w);
        LiveEditText liveEditText = (LiveEditText) view.findViewById(R.id.ax8);
        this.f16849b = liveEditText;
        C6805b<?> bVar = f16846d;
        Object obj = null;
        if (bVar == null || (a = bVar.mo13066a()) == null) {
            cls = null;
        } else {
            cls = a.getClass();
        }
        Object h = C89070n.m154586h((List) C89361p.m154915b(String.valueOf(cls), new String[]{"."}));
        if (alwaysMarqueeTextView != null) {
            Object[] objArr = new Object[1];
            C6805b<?> bVar2 = f16846d;
            if (!(bVar2 == null || (str = bVar2.f16860a) == null)) {
                str2 = str;
            }
            objArr[0] = str2;
            alwaysMarqueeTextView.setText(C3966y.m9660a((int) R.string.gvf, objArr));
        }
        if (alwaysMarqueeTextView2 != null) {
            alwaysMarqueeTextView2.setText(C3966y.m9660a((int) R.string.gvh, h));
        }
        if (liveEditText != null) {
            C6805b<?> bVar3 = f16846d;
            if (bVar3 != null) {
                obj = bVar3.mo13066a();
            }
            liveEditText.setText(String.valueOf(obj));
        }
        this.f16850f = (LiveButton) view.findViewById(R.id.yr);
        LiveButton liveButton = (LiveButton) view.findViewById(R.id.x4);
        mo13059e();
        if (liveButton != null) {
            liveButton.setOnClickListener(new View$OnClickListenerC6794b(this));
        }
    }
}
