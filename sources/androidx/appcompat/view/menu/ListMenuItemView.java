package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.AbstractC0320p;
import androidx.appcompat.widget.C0405al;
import androidx.core.p037h.C0792v;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, AbstractC0320p.AbstractC0321a {

    /* renamed from: a */
    private C0306j f978a;

    /* renamed from: b */
    private ImageView f979b;

    /* renamed from: c */
    private RadioButton f980c;

    /* renamed from: d */
    private TextView f981d;

    /* renamed from: e */
    private CheckBox f982e;

    /* renamed from: f */
    private TextView f983f;

    /* renamed from: g */
    private ImageView f984g;

    /* renamed from: h */
    private ImageView f985h;

    /* renamed from: i */
    private LinearLayout f986i;

    /* renamed from: j */
    private Drawable f987j;

    /* renamed from: k */
    private int f988k;

    /* renamed from: l */
    private Context f989l;

    /* renamed from: m */
    private boolean f990m;

    /* renamed from: n */
    private Drawable f991n;

    /* renamed from: o */
    private boolean f992o;

    /* renamed from: p */
    private int f993p;

    /* renamed from: q */
    private LayoutInflater f994q;

    /* renamed from: r */
    private boolean f995r;

    static {
        Covode.recordClassIndex(325);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0320p.AbstractC0321a
    /* renamed from: a */
    public final boolean mo796a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0320p.AbstractC0321a
    public C0306j getItemData() {
        return this.f978a;
    }

    /* renamed from: b */
    private void m1018b() {
        RadioButton radioButton = (RadioButton) C1764a.m5927a(getInflater(), R.layout.ai, this, false);
        this.f980c = radioButton;
        m1017a(radioButton, -1);
    }

    /* renamed from: c */
    private void m1019c() {
        CheckBox checkBox = (CheckBox) C1764a.m5927a(getInflater(), R.layout.af, this, false);
        this.f982e = checkBox;
        m1017a(checkBox, -1);
    }

    private LayoutInflater getInflater() {
        if (this.f994q == null) {
            this.f994q = LayoutInflater.from(getContext());
        }
        return this.f994q;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C0792v.m2746a(this, this.f987j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f981d = textView;
        int i = this.f988k;
        if (i != -1) {
            textView.setTextAppearance(this.f989l, i);
        }
        this.f983f = (TextView) findViewById(R.id.e0_);
        ImageView imageView = (ImageView) findViewById(R.id.eah);
        this.f984g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f991n);
        }
        this.f985h = (ImageView) findViewById(R.id.bc7);
        this.f986i = (LinearLayout) findViewById(R.id.acq);
    }

    public void setForceShowIcon(boolean z) {
        this.f995r = z;
        this.f990m = z;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i;
        ImageView imageView = this.f984g;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f978a.mo1016e()) {
            if (this.f980c == null) {
                m1018b();
            }
            compoundButton = this.f980c;
        } else {
            if (this.f982e == null) {
                m1019c();
            }
            compoundButton = this.f982e;
        }
        compoundButton.setChecked(z);
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        ImageView imageView = this.f985h;
        if (imageView != null) {
            if (this.f992o || !z) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f985h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f985h.getLayoutParams();
            rect.top += this.f985h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f981d.setText(charSequence);
            if (this.f981d.getVisibility() != 0) {
                this.f981d.setVisibility(0);
            }
        } else if (this.f981d.getVisibility() != 8) {
            this.f981d.setVisibility(8);
        }
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f980c != null || this.f982e != null) {
            if (this.f978a.mo1016e()) {
                if (this.f980c == null) {
                    m1018b();
                }
                compoundButton = this.f980c;
                compoundButton2 = this.f982e;
            } else {
                if (this.f982e == null) {
                    m1019c();
                }
                compoundButton = this.f982e;
                compoundButton2 = this.f980c;
            }
            if (z) {
                compoundButton.setChecked(this.f978a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (compoundButton2 != null && compoundButton2.getVisibility() != 8) {
                    compoundButton2.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f982e;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f980c;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z;
        if (this.f978a.f1126d.f1099k || this.f995r) {
            z = true;
        } else {
            z = false;
            if (!this.f990m) {
                return;
            }
        }
        if (this.f979b == null) {
            if (drawable != null || this.f990m) {
                ImageView imageView = (ImageView) C1764a.m5927a(getInflater(), R.layout.ag, this, false);
                this.f979b = imageView;
                m1017a(imageView, 0);
            } else {
                return;
            }
        }
        if (drawable != null || this.f990m) {
            ImageView imageView2 = this.f979b;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f979b.getVisibility() != 0) {
                this.f979b.setVisibility(0);
                return;
            }
            return;
        }
        this.f979b.setVisibility(8);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0320p.AbstractC0321a
    /* renamed from: a */
    public final void mo795a(C0306j jVar) {
        int i;
        int i2;
        String sb;
        this.f978a = jVar;
        int i3 = 0;
        this.f993p = 0;
        if (jVar.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        setTitle(jVar.mo1007a((AbstractC0320p.AbstractC0321a) this));
        setCheckable(jVar.isCheckable());
        boolean d = jVar.mo1015d();
        jVar.mo1012c();
        if (!d || !this.f978a.mo1015d()) {
            i3 = 8;
        } else {
            TextView textView = this.f983f;
            C0306j jVar2 = this.f978a;
            char c = jVar2.mo1012c();
            if (c == 0) {
                sb = "";
            } else {
                Resources resources = jVar2.f1126d.f1089a.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(jVar2.f1126d.f1089a).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.m0));
                }
                if (jVar2.f1126d.mo976c()) {
                    i2 = jVar2.f1125c;
                } else {
                    i2 = jVar2.f1124b;
                }
                C0306j.m1136a(sb2, i2, 65536, resources.getString(R.string.lw));
                C0306j.m1136a(sb2, i2, 4096, resources.getString(R.string.ls));
                C0306j.m1136a(sb2, i2, 2, resources.getString(R.string.lr));
                C0306j.m1136a(sb2, i2, 1, resources.getString(R.string.lx));
                C0306j.m1136a(sb2, i2, 4, resources.getString(R.string.lz));
                C0306j.m1136a(sb2, i2, 8, resources.getString(R.string.lv));
                if (c == '\b') {
                    sb2.append(resources.getString(R.string.lt));
                } else if (c == '\n') {
                    sb2.append(resources.getString(R.string.lu));
                } else if (c != ' ') {
                    sb2.append(c);
                } else {
                    sb2.append(resources.getString(R.string.ly));
                }
                sb = sb2.toString();
            }
            textView.setText(sb);
        }
        if (this.f983f.getVisibility() != i3) {
            this.f983f.setVisibility(i3);
        }
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private void m1017a(View view, int i) {
        LinearLayout linearLayout = this.f986i;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f979b != null && this.f990m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f979b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    private ListMenuItemView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet);
        C0405al a = C0405al.m1466a(getContext(), attributeSet, new int[]{16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, R.attr.a7m, R.attr.afq}, R.attr.a2q, 0);
        this.f987j = a.mo1826a(5);
        this.f988k = a.mo1838g(1, -1);
        this.f990m = a.mo1827a(7, false);
        this.f989l = context;
        this.f991n = a.mo1826a(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.s1, 0);
        this.f992o = obtainStyledAttributes.hasValue(0);
        a.f1585a.recycle();
        obtainStyledAttributes.recycle();
    }
}
