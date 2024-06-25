<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!-- JSTL -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>Financial Planning System</title>
    <meta content="width=device-width, initial-scale=1.0, shrink-to-fit=no" name="viewport" />
    <link rel="icon" href="../resourses/assets/img/logo.jpg" type="image/x-icon" />

    <!-- Fonts and icons -->
    <script src="../resourses/assets/js/plugin/webfont/webfont.min.js"></script>
    <script>
        WebFont.load({
            google: { families: ["Public Sans:300,400,500,600,700"] },
            custom: {
                families: [
                    "Font Awesome 5 Solid",
                    "Font Awesome 5 Regular",
                    "Font Awesome 5 Brands",
                    "simple-line-icons",
                ],
                urls: ["../resourses/assets/css/fonts.min.css"],
            },
            active: function () {
                sessionStorage.fonts = true;
            },
        });
    </script>

    <!-- CSS Files -->
    <link rel="stylesheet" href="../resourses/assets/css/bootstrap.min.css" />
    <link rel="stylesheet" href="../resourses/assets/css/plugins.min.css" />
    <link rel="stylesheet" href="../resourses/assets/css/kaiadmin.min.css" />

</head>

<body>
    <div class="wrapper">
        <!-- Sidebar -->
        <div class="sidebar" data-background-color="dark">
            <div class="sidebar-logo">
                <!-- Logo Header -->
                <div class="logo-header" data-background-color="dark">
                    <a href="" class="logo">
                        <img src="../resourses/assets/img/logo.jpg" alt="navbar brand" class="navbar-brand" height="30" />
                    </a>
                    <div class="nav-toggle">
                        <button class="btn btn-toggle toggle-sidebar">
                            <i class="gg-menu-right"></i>
                        </button>
                        <button class="btn btn-toggle sidenav-toggler">
                            <i class="gg-menu-left"></i>
                        </button>
                    </div>
                    <button class="topbar-toggler more">
                        <i class="gg-more-vertical-alt"></i>
                    </button>
                </div>
                <!-- End Logo Header -->
            </div>
            <div class="sidebar-wrapper scrollbar scrollbar-inner">
                <div class="sidebar-content">
                    <ul class="nav nav-secondary">
                        <li class="nav-item">
                            <a href="#">
                                <i class="fas fa-home"></i>
                                <p>Home</p>
                            </a>
                        </li>
                        <li class="nav-section">
                            <span class="sidebar-mini-icon">
                                <i class="fa fa-ellipsis-h"></i>
                            </span>
                            <h4 class="text-section">Menu</h4>
                        </li>
                        <li class="nav-item">
                            <a href="#">
                                <i class="fas fa-file-alt"></i>
                                <p>Financial plan</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a data-bs-toggle="collapse" href="#base">
                                <i class="fas fa-clipboard-list"></i>
                                <p>Financial Report</p>
                                <span class="caret"></span>
                            </a>
                            <div class="collapse" id="base">
                                <ul class="nav nav-collapse">
                                    <li>
                                        <a href="">
                                            <span class="sub-item">Monthly Report</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="">
                                            <span class="sub-item">Annual Report</span>
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                        <c
                        <li class="nav-item">
                            <a href="#">
                                <i class="fas fa-clock"></i>
                                <p>Term Management</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="#">
                                <i class="fas fa-user-cog"></i>
                                <p>User Management</p>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- End Sidebar -->
        <div class="main-panel">
            <div class="main-header">
                <div class="main-header-logo">
                    <!-- Logo Header -->
                    <div class="logo-header" data-background-color="dark">
                        <a href="" class="logo">
                            <img src="../resourses/assets/img/logo.jpg" alt="navbar brand" class="navbar-brand" height="20" />
                        </a>
                        <div class="nav-toggle">
                            <button class="btn btn-toggle toggle-sidebar">
                                <i class="gg-menu-right"></i>
                            </button>
                            <button class="btn btn-toggle sidenav-toggler">
                                <i class="gg-menu-left"></i>
                            </button>
                        </div>
                        <button class="topbar-toggler more">
                            <i class="gg-more-vertical-alt"></i>
                        </button>
                    </div>
                    <!-- End Logo Header -->
                </div>
                <!-- Navbar Header -->
                <nav class="navbar navbar-header navbar-header-transparent navbar-expand-lg border-bottom">
                    <div class="container-fluid">
                        <h1 class="navbar-brand mx-auto">FINANCIAL PLAN SYSTEM</h1>
                        <a class="nav-link dropdown-toggle profile-pic" href="#" id="navbarDropdown" role="button"
                            data-bs-toggle="dropdown" aria-expanded="false">
                            <div class="avatar-sm">
                                <img src="../resourses/assets/img/profile.jpg" alt="..." class="avatar-img rounded-circle" />
                            </div>
                            <span class="profile-username">
                                <span class="op-7">Hi,</span>
                                <span class="fw-bold">Hizrian</span>
                            </span>
                        </a>
                        <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                            <li>
                                <div class="dropdown-user-scroll scrollbar-outer">
                                    <div class="user-box">
                                        <div class="avatar-lg">
                                            <img src="../resourses/assets/img/profile.jpg" alt="image profile"
                                                class="avatar-img rounded" />
                                        </div>
                                        <div class="u-text">
                                            <h4>Hizrian</h4>
                                            <p class="text-muted">hello@example.com</p>
                                            <a href="profile.html" class="btn btn-xs btn-secondary btn-sm">View
                                                Profile</a>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <hr class="dropdown-divider">
                            </li>
                            <li><a class="dropdown-item" href="#">My Profile</a></li>
                            <li><a class="dropdown-item" href="#">My Balance</a></li>
                            <li><a class="dropdown-item" href="#">Inbox</a></li>
                            <li>
                                <hr class="dropdown-divider">
                            </li>
                            <li><a class="dropdown-item" href="#">Account Setting</a></li>
                            <li>
                                <hr class="dropdown-divider">
                            </li>
                            <li><a class="dropdown-item" href="#">Logout</a></li>
                        </ul>
                    </div>
                </nav>
                <!-- End Navbar -->
            </div>
            <div class="container">
                <div class="page-inner">
                    <!-- Begin -->
                    <div class="page-header">
                        <h3 class="fw-bold mb-3">Annual Report</h3>
                        <ul class="breadcrumbs mb-3">
                            <li class="nav-home">
                                <a href="#">
                                    <i class="icon-home"></i>
                                </a>
                            </li>
                            <li class="separator">
                                <i class="icon-arrow-right"></i>
                            </li>
                            <li class="nav-item">
                                <a href="#">Annual Report List</a>
                            </li>                      
                        </ul>
                    </div>
                    <div class="col-md-12">
                        <div class="card">
                          <div class="card-body">
                            <div class="table-responsive">
                              <table
                                id="basic-datatables"
                                class="display table table-striped table-hover"
                              >
                                <thead>
                                  <tr>
                                    <th>No.</th>
                                    <th>Year</th>
                                    <th>Total Expense</th>
                                    <th>Total Department</th>
                                    <th>Created Date</th>
                                    <th>Action</th>
                                  </tr>
                                </thead>
                                
                                <tbody id ="tableBody">

                                </tbody>
                              </table>
                            </div>
                          </div>
                        </div>
                      </div>
                    <!-- End -->
                </div>
            </div>
        </div>
    </div>
    <style>
        .navbar-brand.mx-auto {
            font-size: 24px;
            pointer-events: none;
            cursor: default;
        }
    </style>
    <!--   Core JS Files   -->
    <script src="../resourses/assets/js/core/jquery-3.7.1.min.js"></script>
    <script src="../resourses/assets/js/core/popper.min.js"></script>
    <script src="../resourses/assets/js/core/bootstrap.min.js"></script>

    <!-- jQuery Scrollbar -->
    <script src="../resourses/assets/js/plugin/jquery-scrollbar/jquery.scrollbar.min.js"></script>

    <!-- Chart JS -->
    <script src="../resourses/assets/js/plugin/chart.js/chart.min.js"></script>

    <!-- jQuery Sparkline -->
    <script src="../resourses/assets/js/plugin/jquery.sparkline/jquery.sparkline.min.js"></script>

    <!-- Chart Circle -->
    <script src="../resourses/assets/js/plugin/chart-circle/circles.min.js"></script>

    <!-- Datatables -->
    <script src="../resourses/assets/js/plugin/datatables/datatables.min.js"></script>

    <!-- Bootstrap Notify -->
    <!-- <script src="../resourses/assets/js/plugin/bootstrap-notify/bootstrap-notify.min.js"></script> -->

    <!-- jQuery Vector Maps -->
    <script src="../resourses/assets/js/plugin/jsvectormap/jsvectormap.min.js"></script>
    <script src="../resourses/assets/js/plugin/jsvectormap/world.js"></script>

    <!-- Sweet Alert -->
    <script src="../resourses/assets/js/plugin/sweetalert/sweetalert.min.js"></script>

    <!-- Kaiadmin JS -->
    <script src="../resourses/assets/js/kaiadmin.min.js"></script>

    <script>
        $(document).ready(function() {
            $('#basic-datatables').DataTable({});
            // var ajaxData = [];
            //
            //
            // $.ajax({
            //     url: '/annual/getAll',
            //     method: 'GET',
            //     success: function(data) {
            //         ajaxData = data;
            //
            //
            //         $('#basic-datatables').DataTable({
            //             data: ajaxData,
            //             columns: [
            //                 { data: 'annualReportId' },
            //                 { data: 'year' },
            //                 { data: 'totalExpense' },
            //                 { data: 'totalDepartment' },
            //                 { data: 'createdDate' },
            //                 { data: null, defaultContent: '<button class="btn btn-primary btn-sm">Action</button>' }
            //             ],
            //             scrollX: true,
            //             scrollY: '300px',
            //             processing: false,
            //             serverSide: false
            //         });
            //     }
            // });
        });
    </script>
</body>

</html>