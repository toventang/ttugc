package com.bytedance.android.livesdk.chatroom.p499ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3931d;
import com.bytedance.android.livesdk.utils.C11278o;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dq */
public final class C7917dq extends DialogInterface$OnCancelListenerC0944d {

    /* renamed from: a */
    public boolean f19705a;

    /* renamed from: b */
    public AbstractC7918a f19706b;

    /* renamed from: c */
    protected EditText f19707c;

    /* renamed from: d */
    protected View f19708d;

    /* renamed from: e */
    public View f19709e;

    /* renamed from: f */
    protected String f19710f;

    /* renamed from: g */
    protected int f19711g;

    /* renamed from: h */
    protected boolean f19712h;

    /* renamed from: i */
    private final View.OnLayoutChangeListener f19713i;

    /* renamed from: j */
    private boolean f19714j;

    /* renamed from: k */
    private boolean f19715k;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dq$a */
    public interface AbstractC7918a {
        static {
            Covode.recordClassIndex(8713);
        }

        /* renamed from: a */
        void mo14226a();

        /* renamed from: a */
        void mo14227a(String str);
    }

    static {
        Covode.recordClassIndex(8712);
    }

    /* renamed from: a */
    public final void mo14221a() {
        if (this.f19707c != null) {
            C11278o.m19996b(getContext(), this.f19707c);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f19709e.removeOnLayoutChangeListener(this.f19713i);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f19714j) {
            this.f19714j = false;
            m16050b(200, 1, 5);
            return;
        }
        this.f19707c.postDelayed(new RunnableC7921dt(this), 50);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo14224b() {
        if (isAdded()) {
            C11278o.m19995a(getContext(), this.f19707c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo14225c() {
        String trim;
        if (this.f19706b != null) {
            if (this.f19707c.getText() == null) {
                trim = "";
            } else {
                trim = this.f19707c.getText().toString().trim();
            }
            this.f19706b.mo14227a(trim);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f19714j = this.f19705a;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ boolean mo14223a(int i) {
        if (i != 6) {
            return false;
        }
        if (!this.f19708d.isEnabled()) {
            return true;
        }
        this.f19708d.performClick();
        return true;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f19710f = getArguments().getString("live.intent.extra.HINT", null);
            this.f19711g = getArguments().getInt("live.intent.extra.MAX_LENGTH", 0);
            this.f19712h = getArguments().getBoolean("live.intent.extra.TOUCH_MODAL", false);
            this.f19715k = getArguments().getBoolean("live.intent.extra.IS_BROADCASTER", false);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(false);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(3);
            if (!this.f19715k && !C3931d.m9571a(getActivity())) {
                window.addFlags(1024);
            }
            if (!this.f19712h) {
                window.addFlags(32);
                window.clearFlags(2);
            }
        }
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f19706b != null) {
            if (this.f19707c.getText() != null) {
                this.f19707c.getText().toString().trim();
            }
            this.f19706b.mo14226a();
            this.f19706b = null;
            this.f19705a = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            String string = getArguments().getString("live.intent.extra.INPUT");
            if (isAdded() && !TextUtils.isEmpty(string)) {
                this.f19707c.setText(string);
                EditText editText = this.f19707c;
                editText.setSelection(editText.getText().length());
            }
        }
        this.f19707c.setOnEditorActionListener(new C7919dr(this));
        this.f19708d.setOnClickListener(new View$OnClickListenerC7920ds(this));
    }

    /* renamed from: b */
    private void m16050b(long j, int i, int i2) {
        EditText editText = this.f19707c;
        if (editText != null && i <= i2) {
            editText.postDelayed(new RunnableC7922du(this, j, i, i2), j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14222a(long j, int i, int i2) {
        if (isResumed() && this.f19705a) {
            C11278o.m19995a(getContext(), this.f19707c);
            m16050b(j, i + 1, i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        InputFilter[] inputFilterArr;
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.b92, viewGroup, false);
        this.f19709e = a;
        a.addOnLayoutChangeListener(this.f19713i);
        this.f19707c = (EditText) this.f19709e.findViewById(R.id.ahz);
        this.f19708d = this.f19709e.findViewById(R.id.dvg);
        ((KeyboardShadowView) this.f19709e.findViewById(R.id.fg1)).setActivity(getActivity());
        this.f19707c.setHint(this.f19710f);
        if (this.f19711g > 0) {
            InputFilter[] filters = this.f19707c.getFilters();
            if (filters == null || filters.length == 0) {
                inputFilterArr = new InputFilter[1];
            } else {
                inputFilterArr = new InputFilter[(filters.length + 1)];
                for (int i = 0; i < filters.length; i++) {
                    inputFilterArr[i] = filters[i];
                }
            }
            inputFilterArr[inputFilterArr.length - 1] = new InputFilter.LengthFilter(this.f19711g);
            this.f19707c.setFilters(inputFilterArr);
        }
        this.f19709e.findViewById(R.id.ai0).getLayoutParams().width = getResources().getDisplayMetrics().widthPixels;
        return this.f19709e;
    }
}
