/*
 * Copyright (C) 2018  niaoge<78493244@qq.com>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.stategen.framework.generator.util;

/**
 * The Enum JavaType.
 */
/**
 * 
 * @author XiaZhengsheng
 * @version $Id: JavaType.java, v 0.1 2019年3月15日 上午5:18:39 XiaZhengsheng Exp $
 */
public enum JavaType {

    /**
    *  <pre>  * The is entry.  </pre>
    */
    isEntry,

    /**
    *  <pre>  * The is dao.  </pre>
    */
    isDao,

    /**
    *  <pre>  * The is dao impl.  </pre>
    */
    isDaoImpl,

    /**
    *  <pre>  * The is service.  </pre>
    */
    isService,

    isServiceInternal,
    /**
    *  <pre>  * The is service impl.  </pre>
    */
    isServiceImpl,
    /**
    *  <pre>  * The is controller.  </pre>
    */

    isControllerBase,

    isController,
    isApi,
    ;

}
