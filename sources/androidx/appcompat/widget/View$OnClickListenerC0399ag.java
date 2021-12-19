package androidx.appcompat.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.p041d.p042a.AbstractC0838c;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.WeakHashMap;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.ag */
public final class View$OnClickListenerC0399ag extends AbstractC0838c implements View.OnClickListener {

    /* renamed from: a */
    public int f1546a = 1;

    /* renamed from: m */
    private final SearchManager f1547m = ((SearchManager) m1443a(this.f3093e, "search"));

    /* renamed from: n */
    private final SearchView f1548n;

    /* renamed from: o */
    private final SearchableInfo f1549o;

    /* renamed from: p */
    private final Context f1550p;

    /* renamed from: q */
    private final WeakHashMap<String, Drawable.ConstantState> f1551q;

    /* renamed from: r */
    private final int f1552r;

    /* renamed from: s */
    private boolean f1553s = false;

    /* renamed from: t */
    private ColorStateList f1554t;

    /* renamed from: u */
    private int f1555u = -1;

    /* renamed from: v */
    private int f1556v = -1;

    /* renamed from: w */
    private int f1557w = -1;

    /* renamed from: x */
    private int f1558x = -1;

    /* renamed from: y */
    private int f1559y = -1;

    /* renamed from: z */
    private int f1560z = -1;

    static {
        Covode.recordClassIndex(464);
    }

    @Override // androidx.p041d.p042a.AbstractC0833a
    public final boolean hasStableIds() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074 A[Catch:{ RuntimeException -> 0x0016 }] */
    @Override // androidx.p041d.p042a.C0836b.AbstractC0837a, androidx.p041d.p042a.AbstractC0833a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor mo1807a(java.lang.CharSequence r13) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.View$OnClickListenerC0399ag.mo1807a(java.lang.CharSequence):android.database.Cursor");
    }

    @Override // androidx.p041d.p042a.C0836b.AbstractC0837a, androidx.p041d.p042a.AbstractC0833a
    /* renamed from: a */
    public final void mo1809a(Cursor cursor) {
        if (!this.f1553s) {
            try {
                super.mo1809a(cursor);
                if (cursor != null) {
                    this.f1555u = cursor.getColumnIndex("suggest_text_1");
                    this.f1556v = cursor.getColumnIndex("suggest_text_2");
                    this.f1557w = cursor.getColumnIndex("suggest_text_2_url");
                    this.f1558x = cursor.getColumnIndex("suggest_icon_1");
                    this.f1559y = cursor.getColumnIndex("suggest_icon_2");
                    this.f1560z = cursor.getColumnIndex("suggest_flags");
                }
            } catch (Exception unused) {
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    @Override // androidx.p041d.p042a.AbstractC0838c, androidx.p041d.p042a.AbstractC0833a
    /* renamed from: a */
    public final View mo1808a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View a = super.mo1808a(context, cursor, viewGroup);
        a.setTag(new C0400a(a));
        ((ImageView) a.findViewById(R.id.as8)).setImageResource(this.f1552r);
        return a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v10, resolved type: android.text.SpannableString */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011e, code lost:
        if (r11 == null) goto L_0x00fc;
     */
    @Override // androidx.p041d.p042a.AbstractC0833a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1810a(android.view.View r20, android.database.Cursor r21) {
        /*
        // Method dump skipped, instructions count: 328
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.View$OnClickListenerC0399ag.mo1810a(android.view.View, android.database.Cursor):void");
    }

    /* renamed from: a */
    private void m1448a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1551q.put(str, drawable.getConstantState());
        }
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m1451c(mo3045a());
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1451c(mo3045a());
    }

    /* renamed from: c */
    private static void m1451c(Cursor cursor) {
        Bundle extras;
        if (cursor != null && (extras = cursor.getExtras()) != null) {
            extras.getBoolean("in_progress");
        }
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1548n.setQuery((CharSequence) tag);
        }
    }

    /* renamed from: b */
    private Drawable m1450b(String str) {
        Drawable.ConstantState constantState = this.f1551q.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.ag$a */
    public static final class C0400a {

        /* renamed from: a */
        public final TextView f1561a;

        /* renamed from: b */
        public final TextView f1562b;

        /* renamed from: c */
        public final ImageView f1563c;

        /* renamed from: d */
        public final ImageView f1564d;

        /* renamed from: e */
        public final ImageView f1565e;

        static {
            Covode.recordClassIndex(465);
        }

        public C0400a(View view) {
            this.f1561a = (TextView) view.findViewById(16908308);
            this.f1562b = (TextView) view.findViewById(16908309);
            this.f1563c = (ImageView) view.findViewById(16908295);
            this.f1564d = (ImageView) view.findViewById(16908296);
            this.f1565e = (ImageView) view.findViewById(R.id.as8);
        }
    }

    /* renamed from: a */
    private Drawable m1440a(ComponentName componentName) {
        PackageManager packageManager = this.f3093e.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            componentName.flattenToShortString();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // androidx.p041d.p042a.C0836b.AbstractC0837a, androidx.p041d.p042a.AbstractC0833a
    /* renamed from: b */
    public final CharSequence mo1811b(Cursor cursor) {
        String a;
        String a2;
        if (cursor == null) {
            return null;
        }
        String a3 = m1445a(cursor, "suggest_intent_query");
        if (a3 != null) {
            return a3;
        }
        if (this.f1549o.shouldRewriteQueryFromData() && (a2 = m1445a(cursor, "suggest_intent_data")) != null) {
            return a2;
        }
        if (!this.f1549o.shouldRewriteQueryFromText() || (a = m1445a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return a;
    }

    /* renamed from: a */
    private Drawable m1441a(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m1449b(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: ".concat(String.valueOf(uri)));
                }
            } else {
                InputStream openInputStream = this.f1550p.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    try {
                        return Drawable.createFromStream(openInputStream, null);
                    } finally {
                        try {
                            openInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                } else {
                    throw new FileNotFoundException("Failed to open ".concat(String.valueOf(uri)));
                }
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
            return null;
        }
    }

    /* renamed from: a */
    private Drawable m1442a(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1550p.getPackageName() + "/" + parseInt;
            Drawable b = m1450b(str2);
            if (b != null) {
                return b;
            }
            Drawable a = C0643b.m2369a(this.f1550p, parseInt);
            m1448a(str2, a);
            return a;
        } catch (NumberFormatException unused) {
            Drawable b2 = m1450b(str);
            if (b2 != null) {
                return b2;
            }
            Drawable a2 = m1441a(Uri.parse(str));
            m1448a(str, a2);
            return a2;
        } catch (Resources.NotFoundException unused2) {
            return null;
        }
    }

    /* renamed from: b */
    private Drawable m1449b(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f3093e.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: ".concat(String.valueOf(uri)));
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: ".concat(String.valueOf(uri)));
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: ".concat(String.valueOf(uri)));
                }
                throw new FileNotFoundException("No path: ".concat(String.valueOf(uri)));
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: ".concat(String.valueOf(uri)));
            }
        } else {
            throw new FileNotFoundException("No authority: ".concat(String.valueOf(uri)));
        }
    }

    /* renamed from: a */
    private static String m1444a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m1445a(Cursor cursor, String str) {
        return m1444a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private static Object m1443a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }

    /* renamed from: a */
    private static void m1447a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    @Override // androidx.p041d.p042a.AbstractC0833a
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View b = mo3046b(this.f3093e, this.f3092d, viewGroup);
            if (b != null) {
                ((C0400a) b.getTag()).f1561a.setText(e.toString());
            }
            return b;
        }
    }

    @Override // androidx.p041d.p042a.AbstractC0833a
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View a = mo1808a(this.f3093e, this.f3092d, viewGroup);
            if (a != null) {
                ((C0400a) a.getTag()).f1561a.setText(e.toString());
            }
            return a;
        }
    }

    /* renamed from: a */
    private static void m1446a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public View$OnClickListenerC0399ag(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.f1548n = searchView;
        this.f1549o = searchableInfo;
        this.f1552r = searchView.getSuggestionCommitIconResId();
        this.f1550p = context;
        this.f1551q = weakHashMap;
    }
}
