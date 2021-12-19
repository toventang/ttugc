package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.icon.TuxIconView;
import com.p084a.p088b.C1862a;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.common.C39079ae;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39115e;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.AbstractC39273a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.p2082ss.android.ugc.aweme.discover.DiscoveryServiceImpl;
import com.p2082ss.android.ugc.aweme.discover.model.KeyboardModel;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.SearchStateData;
import com.p2082ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41936o;
import com.p2082ss.android.ugc.aweme.discover.p2772g.AbstractC41953a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.SearchIntermediateView;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.p2082ss.android.ugc.aweme.performance.C62849k;
import com.p2082ss.android.ugc.aweme.performance.C62850l;
import com.p2082ss.android.ugc.aweme.performance.EnumC62846j;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3684b.C67350b;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67528bi;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67530bj;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67577u;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67688c;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67694f;
import com.p2082ss.android.ugc.aweme.search.p3701o.C67695a;
import com.p2082ss.android.ugc.aweme.utils.C80530he;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.b */
public abstract class AbstractC42715b extends AbstractC34586a implements SearchIntermediateView.AbstractC42578c, AbstractC90252i, AbstractC90253j {

    /* renamed from: v */
    protected static long f99628v = 1000;

    /* renamed from: A */
    private String f99629A;

    /* renamed from: a */
    View f99630a;

    /* renamed from: b */
    EditText f99631b;

    /* renamed from: c */
    TuxIconView f99632c;

    /* renamed from: d */
    View f99633d;

    /* renamed from: e */
    TextView f99634e;

    /* renamed from: j */
    ImageView f99635j;

    /* renamed from: k */
    FrameLayout f99636k;

    /* renamed from: l */
    SearchIntermediateView f99637l;

    /* renamed from: m */
    KeyboardModel f99638m;

    /* renamed from: n */
    protected SearchStateViewModel f99639n;

    /* renamed from: o */
    protected String f99640o;

    /* renamed from: p */
    SearchIntermediateViewModel f99641p;

    /* renamed from: q */
    protected SearchStateData f99642q;

    /* renamed from: r */
    protected boolean f99643r;

    /* renamed from: s */
    AbstractC88412b f99644s;

    /* renamed from: t */
    protected C67678d f99645t;

    /* renamed from: u */
    protected long f99646u;

    /* renamed from: w */
    protected Word f99647w;

    /* renamed from: y */
    private C80530he f99648y;

    /* renamed from: z */
    private boolean f99649z;

    /* renamed from: b */
    private static String mo73040b(boolean z) {
        return z ? "default_search_keyword" : "normal_search";
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public String mo72943A() {
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo72946a(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo72956b(View view);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo72958b(String str);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo72960c(C67678d dVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo72961c(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo72962d(C67678d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo72965e(String str) {
        return false;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(314, new RunnableC90250g(AbstractC42715b.class, "onSearchSugCompletionEvent", C41936o.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract int mo72968h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract int mo72969i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo72970j();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo72972n() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public abstract String mo72977r();

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public abstract void mo72979t();

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public boolean mo72981v() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo72984y() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public String mo72985z() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo72945C() {
        C67695a.m119852a();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ boolean mo72954a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        mo72956b(view);
        return false;
    }

    /* renamed from: m */
    protected static String m85327m() {
        return C67350b.f150919a.mo106246a(-1);
    }

    static {
        Covode.recordClassIndex(50819);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo72959c() {
        new Handler().postDelayed(new RunnableC42834d(this), 800);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo72978s() {
        getActivity().getWindow().setSoftInputMode(50);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo72967g() {
        if ("homepage_follow".equals(mo72977r()) || "homepage_hot".equals(mo72977r())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo72975p() {
        C67674b bVar = SearchEnterViewModel.C42997a.m85830a(requireActivity()).f100248a;
        if (bVar == null) {
            return false;
        }
        return "1".equals(bVar.obtainLogData("is_from_video"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final String mo72976q() {
        String r = mo72977r();
        C67694f b = C67688c.C67689a.m119841b();
        if (b == null || b.f151724b.isEmpty()) {
            return r;
        }
        return b.f151724b;
    }

    /* renamed from: w */
    public final int mo72982w() {
        Integer value = this.f99639n.searchState.getValue();
        if (value == null) {
            return mo72969i();
        }
        return value.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final /* synthetic */ void mo72944B() {
        mo72972n();
        String obj = this.f99631b.getText().toString();
        C89219l.m154721d(obj, "");
        C67695a.f151727a = obj;
        C67695a.f151728b = System.currentTimeMillis();
        this.f99631b.setText("");
        this.f99631b.requestFocus();
        this.f99631b.setCursorVisible(true);
        this.f99631b.setSelection(0);
        mo72961c("cancel");
        KeyboardUtils.m70896b(this.f99631b);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f99644s = AbstractC88979t.m154296a(AbstractC88979t.m154310b(C39223a.m79604r()), C17873f.m33097e(), C42842e.f99914a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143289d(new C42862f(this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f99644s = AbstractC88979t.m154310b(C39223a.m79604r()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143289d(new C42873k(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo72964e() {
        C67674b bVar;
        if (getActivity() != null && (bVar = SearchEnterViewModel.C42997a.m85830a(getActivity()).f100248a) != null && !TextUtils.isEmpty(bVar.getSearchHint())) {
            String str = (String) bVar.obtainLogData("hint_group_id");
            if (TextUtils.isEmpty(str)) {
                str = bVar.getSearchHintWordId();
            }
            mo72957b(new C42720a(bVar.getSearchHint(), str, (String) bVar.obtainLogData("hint_imp_id")));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo72980u() {
        if (mo72981v()) {
            String obj = this.f99631b.getText().toString();
            int selectionStart = this.f99631b.getSelectionStart();
            if (this.f99649z) {
                selectionStart = this.f99631b.getText().length();
            }
            C67695a.f151731e = selectionStart;
            this.f99649z = false;
            if (this.f99637l.mo72757a()) {
                this.f99637l.mo72755a(obj);
                return;
            }
            this.f99637l.mo72755a(obj);
            this.f99637l.setOpenSugFromState(mo72982w());
            mo72955b(3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo72973o() {
        this.f99635j.setOnClickListener(new View$OnClickListenerC42863g(this));
        this.f99632c.setOnClickListener(new View$OnClickListenerC42864h(this));
        this.f99634e.setOnTouchListener(new AbstractC42662aj() {
            /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b.C427161 */

            static {
                Covode.recordClassIndex(50820);
            }

            @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42662aj
            /* renamed from: a */
            public final void mo70824a(View view) {
                if (AbstractC42715b.this.f99631b != null) {
                    AbstractC42715b.this.mo72963d(AbstractC42715b.this.f99631b.getText().toString());
                    AbstractC42715b.this.mo72966f("click_search");
                }
            }
        });
        C80530he heVar = this.f99648y;
        EditText editText = this.f99631b;
        if (editText != null) {
            editText.addTextChangedListener(new TextWatcher() {
                /* class com.p2082ss.android.ugc.aweme.utils.C80530he.C805311 */

                static {
                    Covode.recordClassIndex(93804);
                }

                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void afterTextChanged(Editable editable) {
                    C80530he heVar = C80530he.this;
                    String obj = editable.toString();
                    if (TextUtils.isEmpty(obj)) {
                        heVar.f180146c = true;
                    } else if (!heVar.f180146c) {
                    } else {
                        if (TextUtils.isEmpty(heVar.f180145b)) {
                            heVar.f180144a.add(obj);
                            heVar.f180145b = obj;
                            return;
                        }
                        int length = heVar.f180145b.length();
                        int length2 = obj.length();
                        if (length == length2) {
                            return;
                        }
                        if (length > length2) {
                            heVar.mo123777b();
                        } else if (!obj.startsWith(heVar.f180145b)) {
                            heVar.mo123777b();
                        } else {
                            heVar.f180144a.add(obj.substring(length));
                            heVar.f180145b = obj;
                        }
                    }
                }
            });
        }
        new C42720a(C67350b.f150919a.mo106246a(-1));
        mo72964e();
        this.f99631b.setHint(C67350b.f150919a.mo106246a(-1));
        this.f99631b.setFilters(new InputFilter[]{new C39079ae()});
        this.f99631b.addTextChangedListener(new TextWatcher() {
            /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b.C427172 */

            static {
                Covode.recordClassIndex(50821);
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                String obj = editable.toString();
                C89219l.m154721d(obj, "");
                long currentTimeMillis = System.currentTimeMillis();
                C62849k kVar = new C62849k(obj);
                kVar.f142521a = currentTimeMillis;
                C62850l.f142527a.put(obj, kVar);
                AbstractC42715b.this.mo72951a((CharSequence) obj);
            }
        });
        this.f99631b.setOnTouchListener(new View$OnTouchListenerC42865i(this));
        this.f99631b.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b.C427183 */

            static {
                Covode.recordClassIndex(50822);
            }

            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 3) {
                    return true;
                }
                AbstractC42715b.this.mo72963d(AbstractC42715b.this.f99631b.getText().toString());
                AbstractC42715b.this.mo72966f("default_click_keyboard");
                return true;
            }
        });
        if (getActivity() != null) {
            KeyboardModel keyboardModel = (KeyboardModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(KeyboardModel.class);
            this.f99638m = keyboardModel;
            keyboardModel.getKeyboardStatus().observe(getActivity(), new AbstractC1214u<Integer>() {
                /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b.C427194 */

                static {
                    Covode.recordClassIndex(50823);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Integer num) {
                    Integer num2 = num;
                    if (num2 == null) {
                        return;
                    }
                    if (num2.intValue() == 1) {
                        KeyboardUtils.m70896b(AbstractC42715b.this.f99631b);
                    } else if (num2.intValue() == 0) {
                        KeyboardUtils.m70897c(AbstractC42715b.this.f99631b);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        if (r1.equals("homepage_hot") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        if (r1.equals("discovery") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0085, code lost:
        if (r1.equals("homepage_follow") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0088, code lost:
        r2 = r1;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72983x() {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b.mo72983x():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.b$a */
    public static class C42720a {

        /* renamed from: a */
        String f99654a;

        /* renamed from: b */
        String f99655b;

        /* renamed from: c */
        String f99656c;

        static {
            Covode.recordClassIndex(50824);
        }

        C42720a(String str) {
            this(str, "");
        }

        C42720a(String str, String str2) {
            this.f99654a = str;
            this.f99655b = str2;
        }

        public C42720a(String str, String str2, String str3) {
            this.f99654a = str;
            this.f99655b = str2;
            this.f99656c = str3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo72948a(C42720a aVar) {
        mo72957b(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo72963d(String str) {
        mo72952a(str, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.SearchIntermediateView.AbstractC42578c
    /* renamed from: a */
    public final void mo72766a(int i) {
        this.f99631b.setHint(C67350b.f150919a.mo106246a(i));
    }

    /* renamed from: a */
    protected static boolean m85325a(String str) {
        int a = C67458j.m119526a();
        for (int i = 0; i < a; i++) {
            if (TextUtils.equals(str, C67350b.f150919a.mo106246a(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.SearchIntermediateView.AbstractC42578c
    /* renamed from: b */
    public void mo72767b(C67678d dVar) {
        if (SearchStateViewModel.isSearchIntermediate(mo72982w()) && !TextUtils.isEmpty(dVar.getKeyword())) {
            mo72960c(dVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72949a(C67678d dVar) {
        C67446h.f151111a.mo106202a(dVar);
        mo72962d(dVar);
        mo72960c(dVar);
        KeyboardUtils.m70897c(this.f99631b);
    }

    /* renamed from: b */
    public void mo72955b(int i) {
        this.f99639n.setSearchState(i);
        this.f99642q.getSearchState().setValue(Integer.valueOf(i));
        if (SearchStateViewModel.isSearchIntermediate(i)) {
            this.f99636k.setVisibility(4);
        } else {
            this.f99636k.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo72966f(String str) {
        String str2;
        EditText editText = this.f99631b;
        if (editText != null) {
            str2 = editText.getText().toString();
            if (TextUtils.isEmpty(str2)) {
                str2 = this.f99631b.getHint().toString();
            }
        } else {
            str2 = "";
        }
        ((C67540c) new C67577u().mo106452c("enter_method", str)).mo106482b(str2).mo96792f();
    }

    @AbstractC90264r
    public void onSearchSugCompletionEvent(C41936o oVar) {
        String str;
        if (af_() && oVar != null && (str = oVar.f97815a) != null && str.length() != 0 && this.f99637l.getVisibility() == 0) {
            this.f99649z = true;
            this.f99631b.setText(str);
            this.f99631b.setSelection(str.length());
            this.f99631b.setCursorVisible(true);
            KeyboardUtils.m70896b(this.f99631b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo72947a(View view) {
        this.f99630a = view.findViewById(R.id.b9r);
        this.f99631b = (EditText) view.findViewById(R.id.ax7);
        this.f99632c = (TuxIconView) view.findViewById(R.id.x8);
        this.f99633d = view.findViewById(R.id.dsw);
        this.f99634e = (TextView) view.findViewById(R.id.f39);
        this.f99635j = (ImageView) view.findViewById(R.id.pj);
        this.f99636k = (FrameLayout) view.findViewById(R.id.b82);
        this.f99637l = (SearchIntermediateView) view.findViewById(R.id.drz);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72957b(C42720a aVar) {
        if (aVar != null) {
            this.f99631b.setHint(aVar.f99654a);
            this.f99647w = new Word(aVar.f99655b, aVar.f99654a);
            C67674b bVar = SearchEnterViewModel.C42997a.m85830a(getActivity()).f100248a;
            if (bVar != null && bVar.getInboxWord() != null) {
                this.f99647w.setId(bVar.getInboxWord().getId());
                this.f99647w.setWordPosition(bVar.getInboxWord().getWordPosition());
                this.f99647w.setImplId(bVar.getInboxWord().getImplId());
            } else if (aVar.f99656c != null) {
                this.f99647w.setImplId(aVar.f99656c);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f99639n = (SearchStateViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(SearchStateViewModel.class);
        this.f99648y = new C80530he();
        mo72946a(getArguments());
        this.f99641p = (SearchIntermediateViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(SearchIntermediateViewModel.class);
        this.f99642q = (SearchStateData) C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null).mo3983a(SearchStateData.class);
        this.f99639n.isLeavingSearchPage.observe(this, new C42812c(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo72950a(Boolean bool) {
        this.f99643r = bool.booleanValue();
        if (bool.booleanValue()) {
            mo72959c();
        }
    }

    /* renamed from: a */
    public final void mo72951a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f99632c.getVisibility() == 8) {
            this.f99632c.setVisibility(0);
        } else if (TextUtils.isEmpty(charSequence) && this.f99632c.getVisibility() == 0) {
            this.f99632c.setVisibility(8);
        }
        if (!TextUtils.equals(this.f99629A, charSequence)) {
            String charSequence2 = charSequence.toString();
            if (!TextUtils.isEmpty(this.f99629A) && TextUtils.isEmpty(charSequence2) && (!this.f99643r)) {
                mo72958b("cancel");
            }
            this.f99629A = charSequence2;
            if (TextUtils.isEmpty(charSequence)) {
                if (mo72982w() != 1) {
                    mo72979t();
                }
            } else if (mo72982w() != 2) {
                mo72980u();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72953a(boolean z) {
        SearchIntermediateView searchIntermediateView = this.f99637l;
        searchIntermediateView.f99317d.mo71170a(z);
        SearchIntermediateViewModel searchIntermediateViewModel = searchIntermediateView.f99314a;
        if (searchIntermediateViewModel == null) {
            C89219l.m154710a("intermediateViewModel");
        }
        searchIntermediateViewModel.hideIntermediate();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.b$b */
    static class C42721b {

        /* renamed from: a */
        ITpcConsentService f99657a;

        /* renamed from: b */
        boolean f99658b;

        /* renamed from: c */
        WeakReference<Activity> f99659c;

        static {
            Covode.recordClassIndex(50825);
        }

        public C42721b(ITpcConsentService iTpcConsentService, Activity activity) {
            this.f99657a = iTpcConsentService;
            this.f99658b = iTpcConsentService.mo68637a((AbstractC39273a) null);
            this.f99659c = new WeakReference<>(activity);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo72955b(mo72969i());
        C39115e.m79414b(this.f99630a);
        SearchIntermediateView searchIntermediateView = this.f99637l;
        C89219l.m154721d(this, "");
        C89219l.m154721d(this, "");
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(activity, "");
        searchIntermediateView.f99315b = this;
        searchIntermediateView.f99319f = C67446h.f151111a.mo106207a((Activity) getActivity());
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        C89219l.m154716b(childFragmentManager, "");
        searchIntermediateView.f99316c = childFragmentManager;
        AbstractC1174ac a = C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(SearchIntermediateViewModel.class);
        C89219l.m154716b(a, "");
        searchIntermediateView.f99314a = (SearchIntermediateViewModel) a;
        SearchIntermediateViewModel searchIntermediateViewModel = searchIntermediateView.f99314a;
        if (searchIntermediateViewModel == null) {
            C89219l.m154710a("intermediateViewModel");
        }
        searchIntermediateViewModel.getIntermediateState().observe(this, searchIntermediateView.f99321h);
        SearchIntermediateViewModel searchIntermediateViewModel2 = searchIntermediateView.f99314a;
        if (searchIntermediateViewModel2 == null) {
            C89219l.m154710a("intermediateViewModel");
        }
        searchIntermediateViewModel2.getSearchTabIndex().observe(this, searchIntermediateView.f99322i);
        this.f99637l.setOnDispatchTouchEventListener(new C42872j(this));
        mo72973o();
        mo72970j();
        ActivityC0945e activity2 = getActivity();
        if (C39223a.m79604r().mo68637a((AbstractC39273a) null) && activity2 != null && !activity2.isFinishing()) {
            C39223a.m79604r().mo68636a(activity2, "deeplink");
        }
        mo72978s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72952a(String str, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        String str2;
        String id;
        String trim = str.trim();
        if (!TextUtils.isEmpty(trim)) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f99646u = currentTimeMillis;
            if (currentTimeMillis - this.f99646u >= f99628v) {
                if (z) {
                    C67678d dVar = this.f99645t;
                    if (dVar == null || !dVar.isOpenNewSearchContainer()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!mo72975p() || !z2) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    SearchIntermediateViewModel searchIntermediateViewModel = this.f99641p;
                    if (searchIntermediateViewModel == null || !searchIntermediateViewModel.backFromSearchResult) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    String str3 = "search_bar_outer";
                    if (!z4 || (!mo72967g() && z3)) {
                        str2 = str3;
                    } else {
                        str2 = "search_bar_inner";
                    }
                    if (!(true ^ SearchEnterViewModel.C42997a.m85830a(requireActivity()).mo73184a())) {
                        str3 = str2;
                    }
                    C67530bj w = new C67528bi().mo106477y(mo72976q()).mo106469a(SearchEnterViewModel.C42997a.m85830a(getActivity()).f100248a.obtainLogData("tab_name")).mo106471d((Integer) 0).mo106474v(str3).mo106475w(trim);
                    Word word = this.f99647w;
                    String str4 = "";
                    if (word == null) {
                        id = str4;
                    } else {
                        id = word.getId();
                    }
                    C67540c cVar = (C67540c) w.mo106453i(id);
                    Word word2 = this.f99647w;
                    if (word2 != null) {
                        str4 = word2.getImplId();
                    }
                    ((C67530bj) cVar.mo106484d(str4).mo106479a((Integer) -1)).mo106476x(trim).mo96792f();
                }
                mo72949a(new C67678d().setKeyword(trim).setSearchFrom(mo73040b(z)).setOpenNewSearchContainer(new AtomicBoolean(false).get()));
                this.f99648y.mo123776a();
                AbstractC41953a aVar = (AbstractC41953a) this.f99637l.getFragment();
                if (aVar != null && getActivity() != null) {
                    aVar.bf_();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (DiscoveryServiceImpl.m83414g().mo70766e()) {
            View a = C1862a.m6032a(getContext(), mo72968h(), viewGroup, false);
            mo72947a(a);
            return a;
        } else if (DiscoveryServiceImpl.m83414g().mo70767f()) {
            View a2 = C1870c.m6046a(getActivity(), mo72968h(), viewGroup, false);
            mo72947a(a2);
            return a2;
        } else {
            View inflate = EnumC62846j.INSTANCE.inflate(layoutInflater, getContext(), mo72968h(), viewGroup);
            mo72947a(inflate);
            return inflate;
        }
    }
}
