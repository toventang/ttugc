package com.bytedance.retrofit2.mime;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

public class TypedFile implements TypedInput, TypedOutput {
    private final File file;
    private final String mimeType;

    static {
        Covode.recordClassIndex(25756);
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String md5Stub() {
        File file2 = this.file;
        return null;
    }

    public File file() {
        return this.file;
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput, com.bytedance.retrofit2.mime.TypedOutput
    public String mimeType() {
        return this.mimeType;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String fileName() {
        return this.file.getName();
    }

    public int hashCode() {
        return this.file.hashCode();
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput, com.bytedance.retrofit2.mime.TypedOutput
    public long length() {
        return this.file.length();
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    /* renamed from: in */
    public InputStream mo11577in() {
        MethodCollector.m26663i(11063);
        FileInputStream fileInputStream = new FileInputStream(this.file);
        MethodCollector.m26664o(11063);
        return fileInputStream;
    }

    public String toString() {
        return this.file.getAbsolutePath() + " (" + mimeType() + ")";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TypedFile) {
            return this.file.equals(((TypedFile) obj).file);
        }
        return false;
    }

    public void moveTo(TypedFile typedFile) {
        MethodCollector.m26663i(11522);
        if (!mimeType().equals(typedFile.mimeType())) {
            IOException iOException = new IOException("Type mismatch.");
            MethodCollector.m26664o(11522);
            throw iOException;
        } else if (this.file.renameTo(typedFile.file())) {
            MethodCollector.m26664o(11522);
        } else {
            IOException iOException2 = new IOException("Rename failed!");
            MethodCollector.m26664o(11522);
            throw iOException2;
        }
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public void writeTo(OutputStream outputStream) {
        MethodCollector.m26663i(11361);
        byte[] bArr = new byte[4096];
        FileInputStream fileInputStream = new FileInputStream(this.file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            } finally {
                fileInputStream.close();
                MethodCollector.m26664o(11361);
            }
        }
    }

    public TypedFile(String str, File file2) {
        str = str == null ? "application/octet-stream" : str;
        Objects.requireNonNull(file2, "file");
        this.mimeType = str;
        this.file = file2;
    }
}
