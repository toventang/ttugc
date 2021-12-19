package androidx.room.p069b;

import android.database.Cursor;
import android.os.Build;
import androidx.p054j.p055a.AbstractC1061b;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: androidx.room.b.d */
public final class C1506d {

    /* renamed from: a */
    public final String f4964a;

    /* renamed from: b */
    public final Map<String, C1507a> f4965b;

    /* renamed from: c */
    public final Set<C1508b> f4966c;

    /* renamed from: d */
    public final Set<C1510d> f4967d;

    static {
        Covode.recordClassIndex(1645);
    }

    /* renamed from: androidx.room.b.d$a */
    public static class C1507a {

        /* renamed from: a */
        public final String f4968a;

        /* renamed from: b */
        public final String f4969b;

        /* renamed from: c */
        public final int f4970c;

        /* renamed from: d */
        public final boolean f4971d;

        /* renamed from: e */
        public final int f4972e;

        static {
            Covode.recordClassIndex(1646);
        }

        /* renamed from: a */
        private boolean m5138a() {
            if (this.f4972e > 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int hashCode = ((this.f4968a.hashCode() * 31) + this.f4970c) * 31;
            if (this.f4971d) {
                i = 1231;
            } else {
                i = 1237;
            }
            return ((hashCode + i) * 31) + this.f4972e;
        }

        public final String toString() {
            return "Column{name='" + this.f4968a + '\'' + ", type='" + this.f4969b + '\'' + ", affinity='" + this.f4970c + '\'' + ", notNull=" + this.f4971d + ", primaryKeyPosition=" + this.f4972e + '}';
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C1507a aVar = (C1507a) obj;
                if (Build.VERSION.SDK_INT >= 20) {
                    if (this.f4972e != aVar.f4972e) {
                        return false;
                    }
                } else if (m5138a() != aVar.m5138a()) {
                    return false;
                }
                if (this.f4968a.equals(aVar.f4968a) && this.f4971d == aVar.f4971d && this.f4970c == aVar.f4970c) {
                    return true;
                }
            }
            return false;
        }

        public C1507a(String str, String str2, boolean z, int i) {
            this.f4968a = str;
            this.f4969b = str2;
            this.f4971d = z;
            this.f4972e = i;
            int i2 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i2 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i2 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i2 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.f4970c = i2;
        }
    }

    /* renamed from: androidx.room.b.d$b */
    public static class C1508b {

        /* renamed from: a */
        public final String f4973a;

        /* renamed from: b */
        public final String f4974b;

        /* renamed from: c */
        public final String f4975c;

        /* renamed from: d */
        public final List<String> f4976d;

        /* renamed from: e */
        public final List<String> f4977e;

        static {
            Covode.recordClassIndex(1647);
        }

        public final int hashCode() {
            return (((((((this.f4973a.hashCode() * 31) + this.f4974b.hashCode()) * 31) + this.f4975c.hashCode()) * 31) + this.f4976d.hashCode()) * 31) + this.f4977e.hashCode();
        }

        public final String toString() {
            return "ForeignKey{referenceTable='" + this.f4973a + '\'' + ", onDelete='" + this.f4974b + '\'' + ", onUpdate='" + this.f4975c + '\'' + ", columnNames=" + this.f4976d + ", referenceColumnNames=" + this.f4977e + '}';
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1508b bVar = (C1508b) obj;
            if (this.f4973a.equals(bVar.f4973a) && this.f4974b.equals(bVar.f4974b) && this.f4975c.equals(bVar.f4975c) && this.f4976d.equals(bVar.f4976d)) {
                return this.f4977e.equals(bVar.f4977e);
            }
            return false;
        }

        public C1508b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f4973a = str;
            this.f4974b = str2;
            this.f4975c = str3;
            this.f4976d = Collections.unmodifiableList(list);
            this.f4977e = Collections.unmodifiableList(list2);
        }
    }

    /* renamed from: androidx.room.b.d$d */
    public static class C1510d {

        /* renamed from: a */
        public final String f4982a;

        /* renamed from: b */
        public final boolean f4983b;

        /* renamed from: c */
        public final List<String> f4984c;

        static {
            Covode.recordClassIndex(1649);
        }

        public final int hashCode() {
            int hashCode;
            if (this.f4982a.startsWith("index_")) {
                hashCode = -1184239155;
            } else {
                hashCode = this.f4982a.hashCode();
            }
            return (((hashCode * 31) + (this.f4983b ? 1 : 0)) * 31) + this.f4984c.hashCode();
        }

        public final String toString() {
            return "Index{name='" + this.f4982a + '\'' + ", unique=" + this.f4983b + ", columns=" + this.f4984c + '}';
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1510d dVar = (C1510d) obj;
            if (this.f4983b != dVar.f4983b || !this.f4984c.equals(dVar.f4984c)) {
                return false;
            }
            if (this.f4982a.startsWith("index_")) {
                return dVar.f4982a.startsWith("index_");
            }
            return this.f4982a.equals(dVar.f4982a);
        }

        public C1510d(String str, boolean z, List<String> list) {
            this.f4982a = str;
            this.f4983b = z;
            this.f4984c = list;
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f4964a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Map<String, C1507a> map = this.f4965b;
        if (map != null) {
            i2 = map.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Set<C1508b> set = this.f4966c;
        if (set != null) {
            i3 = set.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        return "TableInfo{name='" + this.f4964a + '\'' + ", columns=" + this.f4965b + ", foreignKeys=" + this.f4966c + ", indices=" + this.f4967d + '}';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.room.b.d$c */
    public static class C1509c implements Comparable<C1509c> {

        /* renamed from: a */
        final int f4978a;

        /* renamed from: b */
        final int f4979b;

        /* renamed from: c */
        final String f4980c;

        /* renamed from: d */
        final String f4981d;

        static {
            Covode.recordClassIndex(1648);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(C1509c cVar) {
            C1509c cVar2 = cVar;
            int i = this.f4978a - cVar2.f4978a;
            if (i == 0) {
                return this.f4979b - cVar2.f4979b;
            }
            return i;
        }

        C1509c(int i, int i2, String str, String str2) {
            this.f4978a = i;
            this.f4979b = i2;
            this.f4980c = str;
            this.f4981d = str2;
        }
    }

    public final boolean equals(Object obj) {
        Set<C1510d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1506d dVar = (C1506d) obj;
        String str = this.f4964a;
        if (str == null ? dVar.f4964a != null : !str.equals(dVar.f4964a)) {
            return false;
        }
        Map<String, C1507a> map = this.f4965b;
        if (map == null ? dVar.f4965b != null : !map.equals(dVar.f4965b)) {
            return false;
        }
        Set<C1508b> set2 = this.f4966c;
        if (set2 == null ? dVar.f4966c != null : !set2.equals(dVar.f4966c)) {
            return false;
        }
        Set<C1510d> set3 = this.f4967d;
        if (set3 == null || (set = dVar.f4967d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    /* renamed from: a */
    private static List<C1509c> m5134a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C1509c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public static C1506d m5133a(AbstractC1061b bVar, String str) {
        return new C1506d(str, m5136c(bVar, str), m5135b(bVar, str), m5137d(bVar, str));
    }

    /* renamed from: c */
    private static Map<String, C1507a> m5136c(AbstractC1061b bVar, String str) {
        boolean z;
        Cursor b = bVar.mo3782b("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (b.getColumnCount() > 0) {
                int columnIndex = b.getColumnIndex(StringSet.name);
                int columnIndex2 = b.getColumnIndex(StringSet.type);
                int columnIndex3 = b.getColumnIndex("notnull");
                int columnIndex4 = b.getColumnIndex("pk");
                while (b.moveToNext()) {
                    String string = b.getString(columnIndex);
                    String string2 = b.getString(columnIndex2);
                    if (b.getInt(columnIndex3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hashMap.put(string, new C1507a(string, string2, z, b.getInt(columnIndex4)));
                }
            }
            return hashMap;
        } finally {
            b.close();
        }
    }

    /* renamed from: d */
    private static Set<C1510d> m5137d(AbstractC1061b bVar, String str) {
        Cursor b = bVar.mo3782b("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = b.getColumnIndex(StringSet.name);
            int columnIndex2 = b.getColumnIndex("origin");
            int columnIndex3 = b.getColumnIndex("unique");
            if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1) {
                return null;
            }
            HashSet hashSet = new HashSet();
            while (b.moveToNext()) {
                if ("c".equals(b.getString(columnIndex2))) {
                    String string = b.getString(columnIndex);
                    boolean z = true;
                    if (b.getInt(columnIndex3) != 1) {
                        z = false;
                    }
                    C1510d a = m5132a(bVar, string, z);
                    if (a == null) {
                        b.close();
                        return null;
                    }
                    hashSet.add(a);
                }
            }
            b.close();
            return hashSet;
        } finally {
            b.close();
        }
    }

    /* renamed from: b */
    private static Set<C1508b> m5135b(AbstractC1061b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor b = bVar.mo3782b("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = b.getColumnIndex("id");
            int columnIndex2 = b.getColumnIndex("seq");
            int columnIndex3 = b.getColumnIndex("table");
            int columnIndex4 = b.getColumnIndex("on_delete");
            int columnIndex5 = b.getColumnIndex("on_update");
            List<C1509c> a = m5134a(b);
            int count = b.getCount();
            for (int i = 0; i < count; i++) {
                b.moveToPosition(i);
                if (b.getInt(columnIndex2) == 0) {
                    int i2 = b.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C1509c cVar : a) {
                        if (cVar.f4978a == i2) {
                            arrayList.add(cVar.f4980c);
                            arrayList2.add(cVar.f4981d);
                        }
                    }
                    hashSet.add(new C1508b(b.getString(columnIndex3), b.getString(columnIndex4), b.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            b.close();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static C1510d m5132a(AbstractC1061b bVar, String str, boolean z) {
        Cursor b = bVar.mo3782b("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = b.getColumnIndex("seqno");
            int columnIndex2 = b.getColumnIndex("cid");
            int columnIndex3 = b.getColumnIndex(StringSet.name);
            if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1) {
                b.close();
                return null;
            }
            TreeMap treeMap = new TreeMap();
            while (b.moveToNext()) {
                if (b.getInt(columnIndex2) >= 0) {
                    int i = b.getInt(columnIndex);
                    treeMap.put(Integer.valueOf(i), b.getString(columnIndex3));
                }
            }
            ArrayList arrayList = new ArrayList(treeMap.size());
            arrayList.addAll(treeMap.values());
            C1510d dVar = new C1510d(str, z, arrayList);
            b.close();
            return dVar;
        } catch (Throwable th) {
            b.close();
            throw th;
        }
    }

    public C1506d(String str, Map<String, C1507a> map, Set<C1508b> set, Set<C1510d> set2) {
        Set<C1510d> unmodifiableSet;
        this.f4964a = str;
        this.f4965b = Collections.unmodifiableMap(map);
        this.f4966c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            unmodifiableSet = null;
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set2);
        }
        this.f4967d = unmodifiableSet;
    }
}
