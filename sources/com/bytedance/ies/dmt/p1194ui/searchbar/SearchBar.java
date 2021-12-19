package com.bytedance.ies.dmt.p1194ui.searchbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.dmt.ui.searchbar.SearchBar */
public final class SearchBar extends LinearLayout implements View.OnClickListener {

    /* renamed from: a */
    public AbstractC17248b f41183a;

    /* renamed from: b */
    final Handler f41184b;

    /* renamed from: c */
    private HashMap f41185c;

    static {
        Covode.recordClassIndex(19707);
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final View mo27282a(int i) {
        if (this.f41185c == null) {
            this.f41185c = new HashMap();
        }
        View view = (View) this.f41185c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f41185c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.bytedance.ies.dmt.ui.searchbar.SearchBar$a */
    static final class RunnableC17244a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchBar f41186a;

        /* renamed from: b */
        final /* synthetic */ String f41187b;

        static {
            Covode.recordClassIndex(19708);
        }

        RunnableC17244a(SearchBar searchBar, String str) {
            this.f41186a = searchBar;
            this.f41187b = str;
        }

        public final void run() {
            AbstractC17248b bVar = this.f41186a.f41183a;
            if (bVar != null) {
                bVar.mo27295a(this.f41187b);
            }
        }
    }

    /* renamed from: c */
    public final void mo27285c() {
        ((DmtEditText) mo27282a(R.id.ax7)).setText("");
    }

    /* renamed from: b */
    public final void mo27284b() {
        this.f41183a = null;
        ((DmtEditText) mo27282a(R.id.ax7)).setText("");
        ((DmtEditText) mo27282a(R.id.ax7)).clearFocus();
        mo27283a();
    }

    /* renamed from: a */
    public final void mo27283a() {
        String str;
        Object obj;
        Context context = getContext();
        if (Build.VERSION.SDK_INT >= 23) {
            obj = context.getSystemService(InputMethodManager.class);
        } else {
            if (Build.VERSION.SDK_INT >= 23) {
                str = context.getSystemServiceName(InputMethodManager.class);
            } else {
                str = C0643b.C0644a.f2643a.get(InputMethodManager.class);
            }
            if (str != null) {
                obj = C0643b.m2375b(context, str);
            } else {
                obj = null;
            }
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        DmtEditText dmtEditText = (DmtEditText) mo27282a(R.id.ax7);
        C89219l.m154716b(dmtEditText, "");
        ((InputMethodManager) obj).hideSoftInputFromWindow(dmtEditText.getWindowToken(), 0);
    }

    /* renamed from: com.bytedance.ies.dmt.ui.searchbar.SearchBar$b */
    public static final class C17245b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ SearchBar f41188a;

        static {
            Covode.recordClassIndex(19709);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C17245b(SearchBar searchBar) {
            this.f41188a = searchBar;
        }

        public final void afterTextChanged(Editable editable) {
            C89219l.m154721d(editable, "");
            SearchBar searchBar = this.f41188a;
            String obj = editable.toString();
            if (!TextUtils.isEmpty(obj)) {
                TuxIconView tuxIconView = (TuxIconView) searchBar.mo27282a(R.id.x7);
                C89219l.m154716b(tuxIconView, "");
                tuxIconView.setVisibility(0);
            } else {
                TuxIconView tuxIconView2 = (TuxIconView) searchBar.mo27282a(R.id.x7);
                C89219l.m154716b(tuxIconView2, "");
                tuxIconView2.setVisibility(8);
            }
            RunnableC17244a aVar = new RunnableC17244a(searchBar, obj);
            searchBar.f41184b.removeCallbacksAndMessages(null);
            searchBar.f41184b.postDelayed(aVar, 500);
        }
    }

    public final void setSearchBarEventHandler(AbstractC17248b bVar) {
        C89219l.m154721d(bVar, "");
        this.f41183a = bVar;
    }

    private final void setSearchBarOnFocusChangeListener(boolean z) {
        ((DmtEditText) mo27282a(R.id.ax7)).setOnFocusChangeListener(new View$OnFocusChangeListenerC17246c(this, z));
    }

    public final void setOnKeyListener(View.OnKeyListener onKeyListener) {
        C89219l.m154721d(onKeyListener, "");
        ((DmtEditText) mo27282a(R.id.ax7)).setOnKeyListener(onKeyListener);
    }

    public final void onClick(View view) {
        C89219l.m154721d(view, "");
        if (view.getId() == R.id.pi) {
            if (this.f41183a == null) {
            }
        } else if (view.getId() == R.id.x7) {
            ((DmtEditText) mo27282a(R.id.ax7)).setText("");
            TuxIconView tuxIconView = (TuxIconView) mo27282a(R.id.x7);
            if (tuxIconView == null) {
                C89219l.m154715b();
            }
            tuxIconView.setVisibility(8);
            AbstractC17248b bVar = this.f41183a;
            if (bVar != null) {
                bVar.mo27297b();
            }
        } else if (view.getId() == R.id.dr8) {
            if (this.f41183a == null) {
            }
        } else if (C89219l.m154714a(view, mo27282a(R.id.a0z))) {
            mo27285c();
            ((DmtEditText) mo27282a(R.id.ax7)).clearFocus();
            AbstractC17248b bVar2 = this.f41183a;
            if (bVar2 != null) {
                bVar2.mo27294a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.dmt.ui.searchbar.SearchBar$c */
    public static final class View$OnFocusChangeListenerC17246c implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ SearchBar f41189a;

        /* renamed from: b */
        final /* synthetic */ boolean f41190b;

        static {
            Covode.recordClassIndex(19710);
        }

        View$OnFocusChangeListenerC17246c(SearchBar searchBar, boolean z) {
            this.f41189a = searchBar;
            this.f41190b = z;
        }

        public final void onFocusChange(View view, boolean z) {
            int i;
            DmtTextView dmtTextView = (DmtTextView) this.f41189a.mo27282a(R.id.a0z);
            C89219l.m154716b(dmtTextView, "");
            if (!this.f41190b || !z) {
                i = 8;
            } else {
                i = 0;
            }
            dmtTextView.setVisibility(i);
            if (!z) {
                this.f41189a.mo27283a();
            }
            AbstractC17248b bVar = this.f41189a.f41183a;
            if (bVar != null) {
                DmtEditText dmtEditText = (DmtEditText) this.f41189a.mo27282a(R.id.ax7);
                C89219l.m154716b(dmtEditText, "");
                bVar.mo27296a(z, String.valueOf(dmtEditText.getText()));
            }
        }
    }

    private /* synthetic */ SearchBar(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SearchBar(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        int i;
        int i2;
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8186);
        this.f41184b = new Handler();
        View.inflate(context, R.layout.bj6, this);
        Context context2 = getContext();
        C89219l.m154716b(context2, "");
        TypedArray obtainStyledAttributes = context2.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.ab1, R.attr.ac7, R.attr.ac9, R.attr.ac_, R.attr.acg, R.attr.afp}, 0, 0);
        try {
            String string = obtainStyledAttributes.getString(0);
            boolean z = obtainStyledAttributes.getBoolean(2, false);
            if (string != null && string.length() > 0) {
                DmtEditText dmtEditText = (DmtEditText) mo27282a(R.id.ax7);
                C89219l.m154716b(dmtEditText, "");
                dmtEditText.setHint(string);
            }
            ((DmtEditText) mo27282a(R.id.ax7)).addTextChangedListener(new C17245b(this));
            setSearchBarOnFocusChangeListener(z);
            boolean z2 = obtainStyledAttributes.getBoolean(1, false);
            ((AutoRTLImageView) mo27282a(R.id.pi)).setOnClickListener(this);
            AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo27282a(R.id.pi);
            C89219l.m154716b(autoRTLImageView, "");
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            autoRTLImageView.setVisibility(i);
            boolean z3 = obtainStyledAttributes.getBoolean(4, false);
            ((DmtTextView) mo27282a(R.id.dr8)).setOnClickListener(this);
            DmtTextView dmtTextView = (DmtTextView) mo27282a(R.id.dr8);
            C89219l.m154716b(dmtTextView, "");
            if (z3) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            dmtTextView.setVisibility(i2);
            if (obtainStyledAttributes.getBoolean(3, true)) {
                TuxIconView tuxIconView = (TuxIconView) mo27282a(R.id.x7);
                C89219l.m154716b(tuxIconView, "");
                tuxIconView.setVisibility(0);
                ((TuxIconView) mo27282a(R.id.x7)).setOnClickListener(this);
            } else {
                TuxIconView tuxIconView2 = (TuxIconView) mo27282a(R.id.x7);
                C89219l.m154716b(tuxIconView2, "");
                tuxIconView2.setVisibility(8);
            }
            ((DmtTextView) mo27282a(R.id.a0z)).setOnClickListener(this);
            obtainStyledAttributes.recycle();
            setOrientation(0);
            MethodCollector.m26664o(8186);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            MethodCollector.m26664o(8186);
            throw th;
        }
    }
}
