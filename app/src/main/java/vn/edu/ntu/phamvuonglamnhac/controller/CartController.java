package vn.edu.ntu.phamvuonglamnhac.controller;

import android.app.Application;

import java.util.ArrayList;

import vn.edu.ntu.phamvuonglamnhac.model.Product;

public class CartController extends Application implements ICartController {
    ArrayList<Product> listProduct = new ArrayList<>();

    public CartController() {
        listProduct.add(new Product("xoài cát","xoài cát hà lộc loại 1 ",6000));
        listProduct.add(new Product("Khoai lang","khoai lang tím giống nhật ",45000));
        listProduct.add(new Product("Me Thái","Me Thái nhập khẩu ",65000));
        listProduct.add(new Product("Ổi","Ổi chua ",60000));
        listProduct.add(new Product("Mận tím","Mận tím tây bắc ",50000));
        listProduct.add(new Product("Táo đỏ","Táo đỏ Mỹ",6000));
        listProduct.add(new Product("Sầu riêng Khánh Sơn","sầu riêng Khánh Sơn loại 1 ",6000));
    }

    @Override
    public ArrayList<Product> getListProduct() {
        return listProduct;
    }
}
