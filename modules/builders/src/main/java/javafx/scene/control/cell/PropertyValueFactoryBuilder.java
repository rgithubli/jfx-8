/*
 * Copyright (c) 2011, 2014, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package javafx.scene.control.cell;

/**
Builder class for javafx.scene.control.cell.PropertyValueFactory
@see javafx.scene.control.cell.PropertyValueFactory
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class PropertyValueFactoryBuilder<S, T, B extends javafx.scene.control.cell.PropertyValueFactoryBuilder<S, T, B>> implements javafx.util.Builder<javafx.scene.control.cell.PropertyValueFactory<S, T>> {
    protected PropertyValueFactoryBuilder() {
    }

    /** Creates a new instance of PropertyValueFactoryBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static <S, T> javafx.scene.control.cell.PropertyValueFactoryBuilder<S, T, ?> create() {
        return new javafx.scene.control.cell.PropertyValueFactoryBuilder();
    }

    private java.lang.String property;
    /**
    Set the value of the {@link javafx.scene.control.cell.PropertyValueFactory#getProperty() property} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B property(java.lang.String x) {
        this.property = x;
        return (B) this;
    }

    /**
    Make an instance of {@link javafx.scene.control.cell.PropertyValueFactory} based on the properties set on this builder.
    */
    public javafx.scene.control.cell.PropertyValueFactory<S, T> build() {
        javafx.scene.control.cell.PropertyValueFactory<S, T> x = new javafx.scene.control.cell.PropertyValueFactory<S, T>(this.property);
        return x;
    }
}
