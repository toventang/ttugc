package com.zhihu.matisse.internal.p4514b;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.zhihu.matisse.EnumC87938b;
import com.zhihu.matisse.R;
import com.zhihu.matisse.internal.entity.C87955b;
import com.zhihu.matisse.internal.entity.C87956c;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.p4511a.AbstractC87937a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.zhihu.matisse.internal.b.c */
public final class C87949c {

    /* renamed from: a */
    public Set<Item> f199723a;

    /* renamed from: b */
    public int f199724b;

    /* renamed from: c */
    private final Context f199725c;

    static {
        Covode.recordClassIndex(103964);
    }

    /* renamed from: b */
    public final List<Item> mo142457b() {
        return new ArrayList(this.f199723a);
    }

    /* renamed from: e */
    public final int mo142464e() {
        return this.f199723a.size();
    }

    /* renamed from: d */
    public final boolean mo142463d() {
        if (this.f199723a.size() == m152982f()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private int m152982f() {
        C87956c cVar = C87956c.C87957a.f199768a;
        if (cVar.f199753g > 0) {
            return cVar.f199753g;
        }
        int i = this.f199724b;
        if (i == 1) {
            return cVar.f199754h;
        }
        if (i == 2) {
            return cVar.f199755i;
        }
        return cVar.f199753g;
    }

    /* renamed from: a */
    public final Bundle mo142454a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("state_selection", new ArrayList<>(this.f199723a));
        bundle.putInt("state_collection_type", this.f199724b);
        return bundle;
    }

    /* renamed from: c */
    public final List<Uri> mo142460c() {
        ArrayList arrayList = new ArrayList();
        for (Item item : this.f199723a) {
            arrayList.add(item.f199738c);
        }
        return arrayList;
    }

    public C87949c(Context context) {
        this.f199725c = context;
    }

    /* renamed from: c */
    public final boolean mo142461c(Item item) {
        return this.f199723a.contains(item);
    }

    /* renamed from: b */
    public final void mo142458b(Bundle bundle) {
        bundle.putParcelableArrayList("state_selection", new ArrayList<>(this.f199723a));
        bundle.putInt("state_collection_type", this.f199724b);
    }

    /* renamed from: e */
    public final int mo142465e(Item item) {
        int indexOf = new ArrayList(this.f199723a).indexOf(item);
        if (indexOf == -1) {
            return Integer.MIN_VALUE;
        }
        return indexOf + 1;
    }

    /* renamed from: f */
    private boolean m152983f(Item item) {
        int i;
        if (!C87956c.C87957a.f199768a.f199748b) {
            return false;
        }
        if (!item.mo142474a() || !((i = this.f199724b) == 2 || i == 3)) {
            if (!item.mo142476c()) {
                return false;
            }
            int i2 = this.f199724b;
            if (i2 == 1 || i2 == 3) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo142455a(Bundle bundle) {
        if (bundle == null) {
            this.f199723a = new LinkedHashSet();
            return;
        }
        this.f199723a = new LinkedHashSet(bundle.getParcelableArrayList("state_selection"));
        this.f199724b = bundle.getInt("state_collection_type", 0);
    }

    /* renamed from: a */
    public final boolean mo142456a(Item item) {
        if (!m152983f(item)) {
            boolean add = this.f199723a.add(item);
            if (add) {
                int i = this.f199724b;
                if (i == 0) {
                    if (item.mo142474a()) {
                        this.f199724b = 1;
                    } else if (item.mo142476c()) {
                        this.f199724b = 2;
                    }
                } else if (i == 1) {
                    if (item.mo142476c()) {
                        this.f199724b = 3;
                    }
                } else if (i == 2 && item.mo142474a()) {
                    this.f199724b = 3;
                }
            }
            return add;
        }
        throw new IllegalArgumentException("Can't select images and videos at the same time.");
    }

    /* renamed from: b */
    public final boolean mo142459b(Item item) {
        boolean remove = this.f199723a.remove(item);
        if (remove) {
            boolean z = false;
            if (this.f199723a.size() == 0) {
                this.f199724b = 0;
            } else if (this.f199724b == 3) {
                boolean z2 = false;
                for (Item item2 : this.f199723a) {
                    if (item2.mo142474a() && !z) {
                        z = true;
                    }
                    if (item2.mo142476c() && !z2) {
                        z2 = true;
                    }
                }
                if (z) {
                    if (z2) {
                        this.f199724b = 3;
                    } else {
                        this.f199724b = 1;
                    }
                } else if (z2) {
                    this.f199724b = 2;
                }
            }
        }
        return remove;
    }

    /* renamed from: d */
    public final C87955b mo142462d(Item item) {
        String str;
        if (mo142463d()) {
            int f = m152982f();
            try {
                str = this.f199725c.getResources().getQuantityString(R.plurals.matisse_error_over_count, f, Integer.valueOf(f));
            } catch (Resources.NotFoundException unused) {
                str = this.f199725c.getString(com.p2082ss.android.ugc.trill.R.string.d1b, Integer.valueOf(f));
            } catch (NoClassDefFoundError unused2) {
                str = this.f199725c.getString(com.p2082ss.android.ugc.trill.R.string.d1b, Integer.valueOf(f));
            }
            return new C87955b(str);
        } else if (m152983f(item)) {
            return new C87955b(this.f199725c.getString(com.p2082ss.android.ugc.trill.R.string.d1g));
        } else {
            Context context = this.f199725c;
            if (context != null) {
                ContentResolver contentResolver = context.getContentResolver();
                for (EnumC87938b bVar : C87956c.C87957a.f199768a.f199747a) {
                    if (bVar.checkType(context, contentResolver, item.f199738c)) {
                        if (C87956c.C87957a.f199768a.f199756j == null) {
                            return null;
                        }
                        for (AbstractC87937a aVar : C87956c.C87957a.f199768a.f199756j) {
                            C87955b a = aVar.mo61898a(context, item);
                            if (a != null) {
                                return a;
                            }
                        }
                        return null;
                    }
                }
            }
            return new C87955b(context.getString(com.p2082ss.android.ugc.trill.R.string.d1_));
        }
    }
}
