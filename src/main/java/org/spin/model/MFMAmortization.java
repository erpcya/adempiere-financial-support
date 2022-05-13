/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * Copyright (C) 2003-2016 E.R.P. Consultores y Asociados, C.A.               *
 * All Rights Reserved.                                                       *
 * Contributor(s): Carlos Parada www.erpya.com                                *
 *****************************************************************************/
package org.spin.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Loan Amortization
 *
 * @author Carlos Parada, cparada@erpya.com , http://www.erpya.com
 *      <li> FR [ 1586 ]  Generate Amortization
 *		@see https://github.com/adempiere/adempiere/issues/1586
 */

public class MFMAmortization extends org.spin.investment.model.MFMAmortization {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MFMAmortization(Properties ctx, int FM_Amortization_ID, String trxName) {
		super(ctx, FM_Amortization_ID, trxName);
	}

	public MFMAmortization(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
	//	Backward compatibility
}
