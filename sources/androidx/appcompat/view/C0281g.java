package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0306j;
import androidx.appcompat.view.menu.MenuItemC0308k;
import androidx.appcompat.widget.C0455w;
import androidx.core.p028a.p029a.AbstractMenuC0565a;
import androidx.core.p028a.p029a.AbstractMenuItemC0566b;
import androidx.core.p037h.AbstractC0763b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.appcompat.view.g */
public final class C0281g extends MenuInflater {

    /* renamed from: a */
    static final Class<?>[] f912a;

    /* renamed from: b */
    static final Class<?>[] f913b;

    /* renamed from: c */
    final Object[] f914c;

    /* renamed from: d */
    final Object[] f915d;

    /* renamed from: e */
    Context f916e;

    /* renamed from: f */
    Object f917f;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.view.g$a */
    public static class MenuItem$OnMenuItemClickListenerC0282a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private static final Class<?>[] f918a = {MenuItem.class};

        /* renamed from: b */
        private Object f919b;

        /* renamed from: c */
        private Method f920c;

        static {
            Covode.recordClassIndex(316);
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f920c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f920c.invoke(this.f919b, menuItem)).booleanValue();
                }
                this.f920c.invoke(this.f919b, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public MenuItem$OnMenuItemClickListenerC0282a(Object obj, String str) {
            this.f919b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f920c = cls.getMethod(str, f918a);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.view.g$b */
    public class C0283b {

        /* renamed from: A */
        private String f921A;

        /* renamed from: B */
        private String f922B;

        /* renamed from: C */
        private CharSequence f923C;

        /* renamed from: D */
        private CharSequence f924D;

        /* renamed from: E */
        private ColorStateList f925E;

        /* renamed from: F */
        private PorterDuff.Mode f926F;

        /* renamed from: a */
        public boolean f927a;

        /* renamed from: b */
        AbstractC0763b f928b;

        /* renamed from: d */
        private Menu f930d;

        /* renamed from: e */
        private int f931e;

        /* renamed from: f */
        private int f932f;

        /* renamed from: g */
        private int f933g;

        /* renamed from: h */
        private int f934h;

        /* renamed from: i */
        private boolean f935i;

        /* renamed from: j */
        private boolean f936j;

        /* renamed from: k */
        private int f937k;

        /* renamed from: l */
        private int f938l;

        /* renamed from: m */
        private CharSequence f939m;

        /* renamed from: n */
        private CharSequence f940n;

        /* renamed from: o */
        private int f941o;

        /* renamed from: p */
        private char f942p;

        /* renamed from: q */
        private int f943q;

        /* renamed from: r */
        private char f944r;

        /* renamed from: s */
        private int f945s;

        /* renamed from: t */
        private int f946t;

        /* renamed from: u */
        private boolean f947u;

        /* renamed from: v */
        private boolean f948v;

        /* renamed from: w */
        private boolean f949w;

        /* renamed from: x */
        private int f950x;

        /* renamed from: y */
        private int f951y;

        /* renamed from: z */
        private String f952z;

        static {
            Covode.recordClassIndex(317);
        }

        /* renamed from: b */
        public final void mo771b() {
            this.f927a = true;
            m990a(this.f930d.add(this.f931e, this.f937k, this.f938l, this.f939m));
        }

        /* renamed from: c */
        public final SubMenu mo773c() {
            this.f927a = true;
            SubMenu addSubMenu = this.f930d.addSubMenu(this.f931e, this.f937k, this.f938l, this.f939m);
            m990a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: a */
        public final void mo769a() {
            this.f931e = 0;
            this.f932f = 0;
            this.f933g = 0;
            this.f934h = 0;
            this.f935i = true;
            this.f936j = true;
        }

        /* renamed from: a */
        private static char m988a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        public final void mo770a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0281g.this.f916e.obtainStyledAttributes(attributeSet, new int[]{16842766, 16842960, 16843156, 16843230, 16843231, 16843232});
            this.f931e = obtainStyledAttributes.getResourceId(1, 0);
            this.f932f = obtainStyledAttributes.getInt(3, 0);
            this.f933g = obtainStyledAttributes.getInt(4, 0);
            this.f934h = obtainStyledAttributes.getInt(5, 0);
            this.f935i = obtainStyledAttributes.getBoolean(2, true);
            this.f936j = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private void m990a(MenuItem menuItem) {
            boolean z;
            MenuItem enabled = menuItem.setChecked(this.f947u).setVisible(this.f948v).setEnabled(this.f949w);
            boolean z2 = false;
            if (this.f946t > 0) {
                z = true;
            } else {
                z = false;
            }
            enabled.setCheckable(z).setTitleCondensed(this.f940n).setIcon(this.f941o);
            int i = this.f950x;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f922B != null) {
                if (!C0281g.this.f916e.isRestricted()) {
                    C0281g gVar = C0281g.this;
                    if (gVar.f917f == null) {
                        gVar.f917f = C0281g.m986a(gVar.f916e);
                    }
                    menuItem.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerC0282a(gVar.f917f, this.f922B));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f946t >= 2) {
                if (menuItem instanceof C0306j) {
                    ((C0306j) menuItem).mo1009a(true);
                } else if (menuItem instanceof MenuItemC0308k) {
                    MenuItemC0308k kVar = (MenuItemC0308k) menuItem;
                    try {
                        if (kVar.f1150c == null) {
                            kVar.f1150c = ((AbstractMenuItemC0566b) kVar.f1031b).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        kVar.f1150c.invoke(kVar.f1031b, true);
                    } catch (Exception unused) {
                    }
                }
            }
            String str = this.f952z;
            if (str != null) {
                menuItem.setActionView((View) m989a(str, C0281g.f912a, C0281g.this.f914c));
                z2 = true;
            }
            int i2 = this.f951y;
            if (i2 > 0 && !z2) {
                menuItem.setActionView(i2);
            }
            AbstractC0763b bVar = this.f928b;
            if (bVar != null && (menuItem instanceof AbstractMenuItemC0566b)) {
                ((AbstractMenuItemC0566b) menuItem).mo831a(bVar);
            }
            CharSequence charSequence = this.f923C;
            boolean z3 = menuItem instanceof AbstractMenuItemC0566b;
            if (z3) {
                ((AbstractMenuItemC0566b) menuItem).mo832a(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.f924D;
            if (z3) {
                ((AbstractMenuItemC0566b) menuItem).mo834b(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c = this.f942p;
            int i3 = this.f943q;
            if (z3) {
                ((AbstractMenuItemC0566b) menuItem).setAlphabeticShortcut(c, i3);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c, i3);
            }
            char c2 = this.f944r;
            int i4 = this.f945s;
            if (z3) {
                ((AbstractMenuItemC0566b) menuItem).setNumericShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c2, i4);
            }
            PorterDuff.Mode mode = this.f926F;
            if (mode != null) {
                if (z3) {
                    ((AbstractMenuItemC0566b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.f925E;
            if (colorStateList == null) {
                return;
            }
            if (z3) {
                ((AbstractMenuItemC0566b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintList(colorStateList);
            }
        }

        /* renamed from: b */
        public final void mo772b(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0281g.this.f916e.obtainStyledAttributes(attributeSet, new int[]{16842754, 16842766, 16842960, 16843014, 16843156, 16843230, 16843231, 16843233, 16843234, 16843235, 16843236, 16843237, 16843375, R.attr.h8, R.attr.hp, R.attr.hq, R.attr.id, R.attr.pi, R.attr.w4, R.attr.w5, R.attr.a6f, R.attr.abq, R.attr.ajo});
            this.f937k = obtainStyledAttributes.getResourceId(2, 0);
            this.f938l = (obtainStyledAttributes.getInt(5, this.f932f) & -65536) | (obtainStyledAttributes.getInt(6, this.f933g) & 65535);
            this.f939m = obtainStyledAttributes.getText(7);
            this.f940n = obtainStyledAttributes.getText(8);
            this.f941o = obtainStyledAttributes.getResourceId(0, 0);
            this.f942p = m988a(obtainStyledAttributes.getString(9));
            this.f943q = obtainStyledAttributes.getInt(16, 4096);
            this.f944r = m988a(obtainStyledAttributes.getString(10));
            this.f945s = obtainStyledAttributes.getInt(20, 4096);
            if (obtainStyledAttributes.hasValue(11)) {
                this.f946t = obtainStyledAttributes.getBoolean(11, false) ? 1 : 0;
            } else {
                this.f946t = this.f934h;
            }
            this.f947u = obtainStyledAttributes.getBoolean(3, false);
            this.f948v = obtainStyledAttributes.getBoolean(4, this.f935i);
            boolean z = true;
            this.f949w = obtainStyledAttributes.getBoolean(1, this.f936j);
            this.f950x = obtainStyledAttributes.getInt(21, -1);
            this.f922B = obtainStyledAttributes.getString(12);
            this.f951y = obtainStyledAttributes.getResourceId(13, 0);
            this.f952z = obtainStyledAttributes.getString(15);
            String string = obtainStyledAttributes.getString(14);
            this.f921A = string;
            if (string == null) {
                z = false;
            }
            if (z && this.f951y == 0 && this.f952z == null) {
                this.f928b = (AbstractC0763b) m989a(string, C0281g.f913b, C0281g.this.f915d);
            } else {
                this.f928b = null;
            }
            this.f923C = obtainStyledAttributes.getText(17);
            this.f924D = obtainStyledAttributes.getText(22);
            if (obtainStyledAttributes.hasValue(19)) {
                this.f926F = C0455w.m1694a(obtainStyledAttributes.getInt(19, -1), this.f926F);
            } else {
                this.f926F = null;
            }
            if (obtainStyledAttributes.hasValue(18)) {
                this.f925E = obtainStyledAttributes.getColorStateList(18);
            } else {
                this.f925E = null;
            }
            obtainStyledAttributes.recycle();
            this.f927a = false;
        }

        public C0283b(Menu menu) {
            this.f930d = menu;
            mo769a();
        }

        /* renamed from: a */
        private <T> T m989a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = C0281g.this.f916e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        Covode.recordClassIndex(315);
        Class<?>[] clsArr = {Context.class};
        f912a = clsArr;
        f913b = clsArr;
    }

    public C0281g(Context context) {
        super(context);
        this.f916e = context;
        Object[] objArr = {context};
        this.f914c = objArr;
        this.f915d = objArr;
    }

    /* renamed from: a */
    static Object m986a(Object obj) {
        while (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        return obj;
    }

    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof AbstractMenuC0565a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlResourceParser layout = this.f916e.getResources().getLayout(i);
            m987a(layout, Xml.asAttributeSet(layout), menu);
            if (layout != null) {
                layout.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (0 != 0) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private void m987a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C0283b bVar = new C0283b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    int next = xmlPullParser.next();
                    String str = null;
                    boolean z = false;
                    boolean z2 = false;
                    while (next != 1) {
                        if (next != 2) {
                            if (next == 3) {
                                String name2 = xmlPullParser.getName();
                                if (z2 && name2.equals(str)) {
                                    str = null;
                                    z2 = false;
                                } else if (name2.equals("group")) {
                                    bVar.mo769a();
                                } else if (name2.equals("item")) {
                                    if (!bVar.f927a) {
                                        if (bVar.f928b == null || !bVar.f928b.mo1117c()) {
                                            bVar.mo771b();
                                        } else {
                                            bVar.mo773c();
                                        }
                                    }
                                } else if (name2.equals("menu")) {
                                    z = true;
                                }
                            }
                        } else if (!z2) {
                            String name3 = xmlPullParser.getName();
                            if (name3.equals("group")) {
                                bVar.mo770a(attributeSet);
                            } else if (name3.equals("item")) {
                                bVar.mo772b(attributeSet);
                            } else if (name3.equals("menu")) {
                                m987a(xmlPullParser, attributeSet, bVar.mo773c());
                            } else {
                                str = name3;
                                z2 = true;
                            }
                        }
                        next = xmlPullParser.next();
                        if (z) {
                            return;
                        }
                    }
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(String.valueOf(name)));
                }
            }
        }
        throw new RuntimeException("Unexpected end of document");
    }
}
