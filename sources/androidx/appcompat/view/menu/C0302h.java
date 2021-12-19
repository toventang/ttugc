package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C0643b;
import androidx.core.p028a.p029a.AbstractMenuC0565a;
import androidx.core.p037h.AbstractC0763b;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.appcompat.view.menu.h */
public class C0302h implements AbstractMenuC0565a {

    /* renamed from: n */
    private static final int[] f1087n = {1, 4, 5, 3, 2, 0};

    /* renamed from: A */
    private boolean f1088A;

    /* renamed from: a */
    public final Context f1089a;

    /* renamed from: b */
    public final Resources f1090b;

    /* renamed from: c */
    public AbstractC0303a f1091c;

    /* renamed from: d */
    ArrayList<C0306j> f1092d;

    /* renamed from: e */
    public ArrayList<C0306j> f1093e;

    /* renamed from: f */
    public int f1094f;

    /* renamed from: g */
    public ContextMenu.ContextMenuInfo f1095g;

    /* renamed from: h */
    public CharSequence f1096h;

    /* renamed from: i */
    public Drawable f1097i;

    /* renamed from: j */
    public View f1098j;

    /* renamed from: k */
    public boolean f1099k;

    /* renamed from: l */
    public C0306j f1100l;

    /* renamed from: m */
    public boolean f1101m;

    /* renamed from: o */
    private boolean f1102o;

    /* renamed from: p */
    private boolean f1103p;

    /* renamed from: q */
    private ArrayList<C0306j> f1104q;

    /* renamed from: r */
    private boolean f1105r;

    /* renamed from: s */
    private ArrayList<C0306j> f1106s;

    /* renamed from: t */
    private boolean f1107t;

    /* renamed from: u */
    private boolean f1108u;

    /* renamed from: v */
    private boolean f1109v;

    /* renamed from: w */
    private boolean f1110w;

    /* renamed from: x */
    private boolean f1111x;

    /* renamed from: y */
    private ArrayList<C0306j> f1112y = new ArrayList<>();

    /* renamed from: z */
    private CopyOnWriteArrayList<WeakReference<AbstractC0318o>> f1113z = new CopyOnWriteArrayList<>();

    /* renamed from: androidx.appcompat.view.menu.h$a */
    public interface AbstractC0303a {
        static {
            Covode.recordClassIndex(340);
        }

        /* renamed from: a */
        void mo536a(C0302h hVar);

        /* renamed from: a */
        boolean mo539a(C0302h hVar, MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.view.menu.h$b */
    public interface AbstractC0304b {
        static {
            Covode.recordClassIndex(341);
        }

        /* renamed from: a */
        boolean mo818a(C0306j jVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo951a() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: l */
    public C0302h mo993l() {
        return this;
    }

    /* renamed from: b */
    public boolean mo973b() {
        return this.f1088A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo976c() {
        return this.f1102o;
    }

    /* renamed from: d */
    public boolean mo981d() {
        return this.f1103p;
    }

    /* renamed from: a */
    public final void mo954a(AbstractC0318o oVar) {
        mo955a(oVar, this.f1089a);
    }

    /* renamed from: a */
    public final void mo955a(AbstractC0318o oVar, Context context) {
        this.f1113z.add(new WeakReference<>(oVar));
        oVar.mo891a(context, this);
        this.f1107t = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo958a(C0302h hVar, MenuItem menuItem) {
        AbstractC0303a aVar = this.f1091c;
        return aVar != null && aVar.mo539a(hVar, menuItem);
    }

    /* renamed from: a */
    public final boolean mo957a(MenuItem menuItem, AbstractC0318o oVar, int i) {
        C0306j jVar = (C0306j) menuItem;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        boolean b = jVar.mo1010b();
        AbstractC0763b bVar = jVar.f1128f;
        boolean z = bVar != null && bVar.mo1117c();
        if (jVar.mo1038j()) {
            b |= jVar.expandActionView();
            if (b) {
                mo956a(true);
            }
        } else if (jVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                mo956a(false);
            }
            if (!jVar.hasSubMenu()) {
                jVar.mo1008a(new SubMenuC0328u(this.f1089a, this, jVar));
            }
            SubMenuC0328u uVar = (SubMenuC0328u) jVar.getSubMenu();
            if (z) {
                bVar.mo1115a(uVar);
            }
            b |= m1096a(uVar, oVar);
            if (!b) {
                mo956a(true);
            }
        } else if ((i & 1) == 0) {
            mo956a(true);
        }
        return b;
    }

    /* renamed from: a */
    public final void mo956a(boolean z) {
        if (!this.f1111x) {
            this.f1111x = true;
            Iterator<WeakReference<AbstractC0318o>> it = this.f1113z.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC0318o> next = it.next();
                AbstractC0318o oVar = next.get();
                if (oVar == null) {
                    this.f1113z.remove(next);
                } else {
                    oVar.mo892a(this, z);
                }
            }
            this.f1111x = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C0302h mo950a(CharSequence charSequence) {
        m1093a(0, charSequence, 0, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C0302h mo948a(Drawable drawable) {
        m1093a(0, null, 0, drawable, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C0302h mo949a(View view) {
        m1093a(0, null, 0, null, view);
        return this;
    }

    /* renamed from: a */
    public boolean mo959a(C0306j jVar) {
        boolean z = false;
        if (this.f1113z.isEmpty()) {
            return false;
        }
        mo982e();
        Iterator<WeakReference<AbstractC0318o>> it = this.f1113z.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC0318o> next = it.next();
            AbstractC0318o oVar = next.get();
            if (oVar == null) {
                this.f1113z.remove(next);
            } else {
                z = oVar.mo901b(jVar);
                if (z) {
                    break;
                }
            }
        }
        mo983f();
        if (z) {
            this.f1100l = jVar;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo952a(Bundle bundle) {
        Parcelable f;
        if (!this.f1113z.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator<WeakReference<AbstractC0318o>> it = this.f1113z.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC0318o> next = it.next();
                AbstractC0318o oVar = next.get();
                if (oVar == null) {
                    this.f1113z.remove(next);
                } else {
                    int b = oVar.mo900b();
                    if (b > 0 && (f = oVar.mo920f()) != null) {
                        sparseArray.put(b, f);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    public void close() {
        mo956a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo985g() {
        this.f1105r = true;
        mo972b(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo987h() {
        this.f1107t = true;
        mo972b(true);
    }

    /* renamed from: k */
    public final ArrayList<C0306j> mo992k() {
        mo991j();
        return this.f1106s;
    }

    public int size() {
        return this.f1092d.size();
    }

    public void clearHeader() {
        this.f1097i = null;
        this.f1096h = null;
        this.f1098j = null;
        mo972b(false);
    }

    /* renamed from: e */
    public final void mo982e() {
        if (!this.f1108u) {
            this.f1108u = true;
            this.f1109v = false;
            this.f1110w = false;
        }
    }

    /* renamed from: f */
    public final void mo983f() {
        this.f1108u = false;
        if (this.f1109v) {
            this.f1109v = false;
            mo972b(this.f1110w);
        }
    }

    static {
        Covode.recordClassIndex(339);
    }

    public void clear() {
        C0306j jVar = this.f1100l;
        if (jVar != null) {
            mo974b(jVar);
        }
        this.f1092d.clear();
        mo972b(true);
    }

    public boolean hasVisibleItems() {
        if (this.f1101m) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1092d.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final ArrayList<C0306j> mo989i() {
        if (!this.f1105r) {
            return this.f1104q;
        }
        this.f1104q.clear();
        int size = this.f1092d.size();
        for (int i = 0; i < size; i++) {
            C0306j jVar = this.f1092d.get(i);
            if (jVar.isVisible()) {
                this.f1104q.add(jVar);
            }
        }
        this.f1105r = false;
        this.f1107t = true;
        return this.f1104q;
    }

    /* renamed from: j */
    public final void mo991j() {
        ArrayList<C0306j> i = mo989i();
        if (this.f1107t) {
            Iterator<WeakReference<AbstractC0318o>> it = this.f1113z.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<AbstractC0318o> next = it.next();
                AbstractC0318o oVar = next.get();
                if (oVar == null) {
                    this.f1113z.remove(next);
                } else {
                    z |= oVar.mo896a();
                }
            }
            if (z) {
                this.f1093e.clear();
                this.f1106s.clear();
                int size = i.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0306j jVar = i.get(i2);
                    if (jVar.mo1017f()) {
                        this.f1093e.add(jVar);
                    } else {
                        this.f1106s.add(jVar);
                    }
                }
            } else {
                this.f1093e.clear();
                this.f1106s.clear();
                this.f1106s.addAll(mo989i());
            }
            this.f1107t = false;
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1088A = z;
    }

    /* renamed from: a */
    public void mo953a(AbstractC0303a aVar) {
        this.f1091c = aVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void setQwertyMode(boolean z) {
        this.f1102o = z;
        mo972b(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C0302h mo947a(int i) {
        m1093a(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return mo946a(0, 0, 0, this.f1090b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f1090b.getString(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C0302h mo969b(int i) {
        m1093a(0, null, i, null, null);
        return this;
    }

    public MenuItem getItem(int i) {
        return this.f1092d.get(i);
    }

    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f1092d.get(i2).getItemId() == i) {
                break;
            } else {
                i2++;
            }
        }
        m1094a(i2, true);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return mo946a(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public final void mo971b(AbstractC0318o oVar) {
        Iterator<WeakReference<AbstractC0318o>> it = this.f1113z.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC0318o> next = it.next();
            AbstractC0318o oVar2 = next.get();
            if (oVar2 == null || oVar2 == oVar) {
                this.f1113z.remove(next);
            }
        }
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0306j jVar = this.f1092d.get(i2);
            if (jVar.getItemId() == i) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public void removeGroup(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f1092d.get(i2).getGroupId() == i) {
                if (i2 >= 0) {
                    int size2 = this.f1092d.size() - i2;
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        if (i3 >= size2 || this.f1092d.get(i2).getGroupId() != i) {
                            mo972b(true);
                        } else {
                            m1094a(i2, false);
                            i3 = i4;
                        }
                    }
                    mo972b(true);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public C0302h(Context context) {
        Resources resources;
        int identifier;
        boolean z = false;
        this.f1088A = false;
        this.f1089a = context;
        Resources resources2 = context.getResources();
        this.f1090b = resources2;
        this.f1092d = new ArrayList<>();
        this.f1104q = new ArrayList<>();
        this.f1105r = true;
        this.f1093e = new ArrayList<>();
        this.f1106s = new ArrayList<>();
        this.f1107t = true;
        if (resources2.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT < 28 ? !((identifier = (resources = context.getResources()).getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android")) == 0 || !resources.getBoolean(identifier)) : viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent()) {
                z = true;
            }
        }
        this.f1103p = z;
    }

    /* renamed from: b */
    public final void mo970b(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f1113z.isEmpty()) {
            Iterator<WeakReference<AbstractC0318o>> it = this.f1113z.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC0318o> next = it.next();
                AbstractC0318o oVar = next.get();
                if (oVar == null) {
                    this.f1113z.remove(next);
                } else {
                    int b = oVar.mo900b();
                    if (b > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(b)) != null) {
                        oVar.mo909a(parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo975c(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0302h) item.getSubMenu()).mo975c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo951a(), sparseArray);
        }
    }

    /* renamed from: d */
    public final void mo980d(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo951a());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0302h) item.getSubMenu()).mo980d(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: b */
    public void mo972b(boolean z) {
        if (!this.f1108u) {
            if (z) {
                this.f1105r = true;
                this.f1107t = true;
            }
            if (!this.f1113z.isEmpty()) {
                mo982e();
                Iterator<WeakReference<AbstractC0318o>> it = this.f1113z.iterator();
                while (it.hasNext()) {
                    WeakReference<AbstractC0318o> next = it.next();
                    AbstractC0318o oVar = next.get();
                    if (oVar == null) {
                        this.f1113z.remove(next);
                    } else {
                        oVar.mo895a(z);
                    }
                }
                mo983f();
                return;
            }
            return;
        }
        this.f1109v = true;
        if (z) {
            this.f1110w = true;
        }
    }

    /* renamed from: b */
    public boolean mo974b(C0306j jVar) {
        boolean z = false;
        if (!this.f1113z.isEmpty() && this.f1100l == jVar) {
            mo982e();
            Iterator<WeakReference<AbstractC0318o>> it = this.f1113z.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC0318o> next = it.next();
                AbstractC0318o oVar = next.get();
                if (oVar == null) {
                    this.f1113z.remove(next);
                } else {
                    z = oVar.mo902c(jVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo983f();
            if (z) {
                this.f1100l = null;
            }
        }
        return z;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        if (m1092a(i, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo957a(findItem(i), (AbstractC0318o) null, i2);
    }

    /* renamed from: a */
    private static int m1091a(ArrayList<C0306j> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f1123a <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1092d.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0306j jVar = this.f1092d.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f1092d.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0306j jVar = this.f1092d.get(i2);
            if (jVar.getGroupId() == i && jVar.mo1011b(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo972b(true);
        }
    }

    /* renamed from: a */
    private C0306j m1092a(int i, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<C0306j> arrayList = this.f1112y;
        arrayList.clear();
        m1095a(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean c = mo976c();
        for (int i2 = 0; i2 < size; i2++) {
            C0306j jVar = arrayList.get(i2);
            if (c) {
                numericShortcut = jVar.getAlphabeticShortcut();
            } else {
                numericShortcut = jVar.getNumericShortcut();
            }
            if ((numericShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((numericShortcut == keyData.meta[2] && (metaState & 2) != 0) || (c && numericShortcut == '\b' && i == 67))) {
                return jVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m1094a(int i, boolean z) {
        if (i >= 0 && i < this.f1092d.size()) {
            this.f1092d.remove(i);
            if (z) {
                mo972b(true);
            }
        }
    }

    /* renamed from: a */
    private boolean m1096a(SubMenuC0328u uVar, AbstractC0318o oVar) {
        boolean z = false;
        if (this.f1113z.isEmpty()) {
            return false;
        }
        if (oVar != null) {
            z = oVar.mo899a(uVar);
        }
        Iterator<WeakReference<AbstractC0318o>> it = this.f1113z.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC0318o> next = it.next();
            AbstractC0318o oVar2 = next.get();
            if (oVar2 == null) {
                this.f1113z.remove(next);
            } else if (!z) {
                z = oVar2.mo899a(uVar);
            }
        }
        return z;
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        C0306j a = m1092a(i, keyEvent);
        if (a != null) {
            z = mo957a(a, (AbstractC0318o) null, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            mo956a(true);
        }
        return z;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1092d.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0306j jVar = this.f1092d.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.mo1009a(z2);
                jVar.setCheckable(z);
            }
        }
    }

    /* renamed from: a */
    private void m1095a(List<C0306j> list, int i, KeyEvent keyEvent) {
        char numericShortcut;
        int numericModifiers;
        boolean c = mo976c();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1092d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0306j jVar = this.f1092d.get(i2);
                if (jVar.hasSubMenu()) {
                    ((C0302h) jVar.getSubMenu()).m1095a(list, i, keyEvent);
                }
                if (c) {
                    numericShortcut = jVar.getAlphabeticShortcut();
                    numericModifiers = jVar.getAlphabeticModifiers();
                } else {
                    numericShortcut = jVar.getNumericShortcut();
                    numericModifiers = jVar.getNumericModifiers();
                }
                if ((modifiers & 69647) == (numericModifiers & 69647) && numericShortcut != 0 && ((numericShortcut == keyData.meta[0] || numericShortcut == keyData.meta[2] || (c && numericShortcut == '\b' && i == 67)) && jVar.isEnabled())) {
                    list.add(jVar);
                }
            }
        }
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo946a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo946a(i, i2, i3, this.f1090b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f1090b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0306j jVar = (C0306j) mo946a(i, i2, i3, charSequence);
        SubMenuC0328u uVar = new SubMenuC0328u(this.f1089a, this, jVar);
        jVar.mo1008a(uVar);
        return uVar;
    }

    /* renamed from: a */
    public MenuItem mo946a(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = (-65536 & i3) >> 16;
        if (i4 >= 0) {
            int[] iArr = f1087n;
            if (i4 < iArr.length) {
                int i5 = (iArr[i4] << 16) | (65535 & i3);
                C0306j jVar = new C0306j(this, i, i2, i3, i5, charSequence, this.f1094f);
                ContextMenu.ContextMenuInfo contextMenuInfo = this.f1095g;
                if (contextMenuInfo != null) {
                    jVar.f1129g = contextMenuInfo;
                }
                ArrayList<C0306j> arrayList = this.f1092d;
                arrayList.add(m1091a(arrayList, i5), jVar);
                mo972b(true);
                return jVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: a */
    private void m1093a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f1090b;
        if (view != null) {
            this.f1098j = view;
            this.f1096h = null;
            this.f1097i = null;
        } else {
            if (i > 0) {
                this.f1096h = resources.getText(i);
            } else if (charSequence != null) {
                this.f1096h = charSequence;
            }
            if (i2 > 0) {
                this.f1097i = C0643b.m2369a(this.f1089a, i2);
            } else if (drawable != null) {
                this.f1097i = drawable;
            }
            this.f1098j = null;
        }
        mo972b(false);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        PackageManager packageManager = this.f1089a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < i5; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            if (resolveInfo.specificIndex < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[resolveInfo.specificIndex];
            }
            Intent intent3 = new Intent(intent2);
            intent3.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent4;
            }
        }
        return i5;
    }
}
